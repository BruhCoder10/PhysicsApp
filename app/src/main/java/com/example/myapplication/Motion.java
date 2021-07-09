package com.example.myapplication;

import android.view.animation.LinearInterpolator;

public class Motion {

    private float f_velocity,i_velocity,displacement,time,acceleration;

    public Motion(float f_velocity, float i_velocity, float displacement, float time, float acceleration) {
        this.f_velocity = f_velocity;
        this.i_velocity = i_velocity;
        this.displacement = displacement;
        this.time = time;
        this.acceleration = acceleration;
    }

    // TODO : LATER MAKE THIS WORK AND ALSO WITH THE 5TH EQUATION OF MOTION

    // Time finding Methods :-

    // v-u/a = t .... 1st Equation of motion
    public float getTime_byF_velocityI_velocityAcceleration(){
        time = (f_velocity-i_velocity)/acceleration;
        return time;
    }

    // 2s/v-u = t ... 4th equation of motion
    public float getTime_byF_velocityI_velocityDisplacement(){
        time = (2*displacement)/(f_velocity-i_velocity);
        return time;
    }

    // Acceleration finding methods :-

    public float getAcceleration_byF_velocityI_velocityTime(){
        acceleration = (f_velocity-i_velocity)/time;
        return acceleration;
    }

    // 2s-2ut/t^2 = a
    public float getAcceleration_byDisplacementI_velocityTime(){
        float upper_half = (2*displacement) - (2*i_velocity*time);
        float lower_half = time*time;
        acceleration = upper_half/lower_half;
        return acceleration;
    }

    // v^2 - u^2/2s = a
    public float getAcceleration_byF_velocityI_velocityDisplacement(){
        float upper_half = (f_velocity*f_velocity) - (i_velocity*i_velocity);
        float lower_half = (2*displacement);
        acceleration = upper_half/lower_half;
        return acceleration;
    }

    // 2S - 2vt/-t^2 = a
    public float getAcceleration_byDisplacementF_velocityTime(){
        float upper_half = (2*displacement) - (2*f_velocity*time);
        float lower_half = (time*time) * -1;
        acceleration = upper_half/lower_half;
        return acceleration;
    }

    // Final Velocity finding methods
    public float getF_velocity_byI_velocityAccelerationTime(){
        f_velocity = i_velocity + (acceleration*time);
        return f_velocity;
    }

    // v = root(u + 2as)
    public float getF_velocity_byI_velocityAccelerationDisplacement(){
        float rootFindingOf = i_velocity + (2*acceleration*displacement);
        f_velocity = (float) Math.sqrt(rootFindingOf);
        return f_velocity;
    }

    // 2s/t - u = v
    public float getF_velocity_byDisplacementTimeI_velocity(){
        float value = (2*displacement)/time;
        f_velocity = value - i_velocity;
        return f_velocity;
    }

    public float getF_velocity() {
        return f_velocity;
    }

    public void setF_velocity(float f_velocity) {
        this.f_velocity = f_velocity;
    }

    public float getI_velocity() {
        return i_velocity;
    }

    public void setI_velocity(float i_velocity) {
        this.i_velocity = i_velocity;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }
}
