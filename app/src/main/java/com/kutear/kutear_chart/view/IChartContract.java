package com.kutear.kutear_chart.view;

/**
 * @author: kutear.guo
 * @create: 2017/3/20 10:45
 * <p>
 * 图表类公共接口
 */

public interface IChartContract {
    /**
     * X轴数据展示
     */
    public interface IFormatAxis {
        /**
         * 格式化X的展示
         *
         * @param xAxis
         * @return
         */
        String formatX(String xAxis);

        /**
         * 格式化X的展示
         *
         * @param yAxis
         * @return
         */
        String formatY(float yAxis);
    }

    /**
     * Y轴范围
     */
    public interface IMaxMin {
        float getMax(float max, float min);

        float getMin(float max, float min);
    }


    public interface ITipShow {
        String getTips(int position, String x, float y);
    }

    /**
     * 点击事件
     */
    public interface OnTapListener {
        /**
         * 点击
         *
         * @param position
         * @param value
         */
        void onTapEvent(int position, float value);

        /**
         * 点击取消
         */
        void onTapCancel();
    }

    /**
     * 单个柱包含的数据信息
     */
    class ChartSingleData {
        public String xData;
        public float yData;

        public ChartSingleData(String xData, float yData) {
            this.xData = xData;
            this.yData = yData;
        }
    }
}
