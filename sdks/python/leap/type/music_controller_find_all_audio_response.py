# coding: utf-8

"""
    Leap

    The Official Leap API

    The version of the OpenAPI document: 1.0
    Created by: https://tryleap.ai/
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal

from leap.type.musicgen_inference_entity import MusicgenInferenceEntity

MusicControllerFindAllAudioResponse = typing.List[MusicgenInferenceEntity]
