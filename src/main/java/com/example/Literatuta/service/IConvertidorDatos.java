package com.example.Literatuta.service;

public interface IConvertidorDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
