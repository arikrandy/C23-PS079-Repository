# Machine Learning
- Our team collect the images dataset from Kaggle for making the model of machine learning and create the dataset for daily skincare recommendation.

- preporcessing the datasets, starts from manual reorganizing images for increasing the accuracy of training model machine learning, reshape, augment, until splitting the images to train_dataset and test_dataset.

- Our team use the sequential model MobileNet for creating the Machine Learning model. MobileNet is one of CNN architecture consists of depthwise separable convolutions, which are lightweight alternatives to standard convolutions. The addional of GlobalAveragePoolid2D to perform spatial pooling over the entire spatial dimensions then reduces the spatial dimensions to a fixed size while preserving important spatial information of the images.

 - To compile the model we use Adam's optimizer for the updated based on the computed gradients during training, categorical_crossentropy's loss for measures the model's performance during training and provides a quantifiable measure of how well the predictions match the actual labels, and accuracy's metric for easures the proportion of correctly predicted samples to the total number of samples.
