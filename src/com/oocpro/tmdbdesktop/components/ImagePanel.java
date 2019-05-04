package com.oocpro.tmdbdesktop.components;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

//Panel to display an Image

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel(BufferedImage img) {
        image = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
