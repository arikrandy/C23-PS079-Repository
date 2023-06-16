# Machine Learning
- Our team collect the images dataset from Kaggle for making the model of machine learning and create the dataset for daily skincare recommendation.

- preporcessing the datasets, starts from manual reorganizing images for increasing the accuracy of training model machine learning, reshape, augment, until splitting the images to train_dataset and test_dataset.

- To deploy the Docker container to Google Cloud Container Registry: docker push gcr.io/capstone-389113/flask-app-deploy.

 - to submit the build to Container Registry: gcloud builds submit --tag gcr.io/capstone-389113/flask-app-deploy.
 - Test API with Link provided by cloud run
