package com.commons;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public final class VerificationCode {
    public static String create(final int width, final int height, final String imgType, OutputStream output) {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        graphics.setColor(Color.getColor("F8F8F8"));
        graphics.fillRect(0, 0, width, height);

        Color[] colors = new Color[] {
                Color.BLUE, Color.GRAY, Color.GREEN, Color.RED, Color.BLACK, Color.ORANGE, Color.CYAN
        };

        for (int i = 0; i < 50; i++) {
            graphics.setColor(colors[random.nextInt(colors.length)]);

            final int x = random.nextInt(width);
            final int y = random.nextInt(height);
            final int w = random.nextInt(20);
            final int h = random.nextInt(20);
            final int signA = random.nextBoolean() ? 1 : -1;
            final int signB = random.nextBoolean() ? 1 : -1;

            graphics.drawLine(x, y, x + w * signA, y + h * signB);
        }

        graphics.setFont(new Font("Comic Sans MS", Font.BOLD, 30));

        for (int i = 0; i < 6; i++) {
            final int temp = random.nextInt(26) + 97;
            String s = String.valueOf((char) temp);

            buffer.append(s);

            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawString(s, i * (width / 6), height - (height / 3));
        }

        graphics.dispose();

        try {
            ImageIO.write(image, imgType, output);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }
}
