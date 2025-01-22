# !pip install ultralytics
# !pip install roboflow
import ultralytics

from roboflow import Roboflow

rf = Roboflow(api_key="jfDwdRgrKTUWHsbFer2s")
project = rf.workspace("mbcai-sejx5").project("python_ai_team1")
version = project.version(12)
dataset = version.download("yolov11")
