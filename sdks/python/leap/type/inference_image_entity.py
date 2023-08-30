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


class RequiredInferenceImageEntity(TypedDict):
    id: str

    createdAt: str

    uri: str

class OptionalInferenceImageEntity(TypedDict, total=False):
    pass

class InferenceImageEntity(RequiredInferenceImageEntity, OptionalInferenceImageEntity):
    pass
