package com.raoqiang.phoenix.calculate.constant;

public class Columns {

    public static final String[] APPLICATION_COLUMNS = {
            "AMT_ANNUITY", "AMT_CREDIT", "AMT_GOODS_PRICE", "AMT_INCOME_TOTAL",
            "AMT_REQ_CREDIT_BUREAU_HOUR", "AMT_REQ_CREDIT_BUREAU_QRT",
            "AMT_REQ_CREDIT_BUREAU_WEEK", "APARTMENTS_AVG", "APARTMENTS_MEDI",
            "APARTMENTS_MODE", "CODE_GENDER", "DAYS_BIRTH", "DAYS_EMPLOYED",
            "DAYS_ID_PUBLISH", "DAYS_LAST_PHONE_CHANGE", "DAYS_REGISTRATION",
            "DEF_30_CNT_SOCIAL_CIRCLE", "DEF_60_CNT_SOCIAL_CIRCLE", "ENTRANCES_AVG",
            "ENTRANCES_MEDI", "EXT_SOURCE_1", "EXT_SOURCE_2", "EXT_SOURCE_3",
            "FLAG_DOCUMENT_18", "FLAG_DOCUMENT_3", "FLAG_DOCUMENT_8", "FLAG_OWN_CAR",
            "FLAG_WORK_PHONE", "FLOORSMAX_AVG", "FLOORSMAX_MEDI", "FLOORSMAX_MODE",
            "LIVE_CITY_NOT_WORK_CITY", "LIVE_REGION_NOT_WORK_REGION", "LIVINGAREA_AVG",
            "NAME_CONTRACT_TYPE", "NAME_EDUCATION_TYPE", "NAME_FAMILY_STATUS",
            "NAME_HOUSING_TYPE", "NAME_INCOME_TYPE", "NAME_TYPE_SUITE",
            "OCCUPATION_TYPE", "ORGANIZATION_TYPE", "OWN_CAR_AGE",
            "REGION_POPULATION_RELATIVE", "REGION_RATING_CLIENT",
            "REGION_RATING_CLIENT_W_CITY", "REG_CITY_NOT_LIVE_CITY", "SK_ID_CURR",
            "TARGET", "TOTALAREA_MODE", "WALLSMATERIAL_MODE",
            "WEEKDAY_APPR_PROCESS_START", "YEARS_BEGINEXPLUATATION_MEDI",
            "DOCUMENT_COUNT", "NEW_DOC_KURT", "AGE_RANGE", "EXT_SOURCES_PROD",
            "EXT_SOURCES_WEIGHTED", "EXT_SOURCES_MIN", "EXT_SOURCES_MAX",
            "EXT_SOURCES_MEAN", "EXT_SOURCES_NANMEDIAN", "EXT_SOURCES_VAR",
            "CREDIT_TO_ANNUITY_RATIO", "CREDIT_TO_GOODS_RATIO",
            "ANNUITY_TO_INCOME_RATIO", "CREDIT_TO_INCOME_RATIO",
            "INCOME_TO_EMPLOYED_RATIO", "INCOME_TO_BIRTH_RATIO",
            "EMPLOYED_TO_BIRTH_RATIO", "ID_TO_BIRTH_RATIO", "CAR_TO_BIRTH_RATIO",
            "CAR_TO_EMPLOYED_RATIO", "PHONE_TO_BIRTH_RATIO", "GROUP_EXT_SOURCES_MEDIAN",
            "GROUP_EXT_SOURCES_STD", "GROUP_INCOME_MEAN", "GROUP_INCOME_STD",
            "GROUP_CREDIT_TO_ANNUITY_MEAN", "GROUP_CREDIT_TO_ANNUITY_STD",
            "GROUP_CREDIT_MEAN", "GROUP_ANNUITY_MEAN", "GROUP_ANNUITY_STD"
    };

    public static final String[] BUREAU_COLUMNS = {"SK_ID_CURR","BUREAU_SK_ID_BUREAU_NUNIQUE","BUREAU_DAYS_CREDIT_MIN",
            "BUREAU_DAYS_CREDIT_MAX","BUREAU_DAYS_CREDIT_MEAN",
            "BUREAU_DAYS_CREDIT_ENDDATE_MIN","BUREAU_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_AMT_CREDIT_MAX_OVERDUE_MAX","BUREAU_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_AMT_CREDIT_SUM_MAX","BUREAU_AMT_CREDIT_SUM_MEAN",
            "BUREAU_AMT_CREDIT_SUM_SUM","BUREAU_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_AMT_CREDIT_SUM_DEBT_MEAN","BUREAU_AMT_CREDIT_SUM_DEBT_SUM",
            "BUREAU_AMT_CREDIT_SUM_OVERDUE_MAX","BUREAU_AMT_CREDIT_SUM_OVERDUE_MEAN",
            "BUREAU_AMT_CREDIT_SUM_OVERDUE_SUM","BUREAU_AMT_ANNUITY_MEAN",
            "BUREAU_DEBT_CREDIT_DIFF_MEAN","BUREAU_DEBT_CREDIT_DIFF_SUM",
            "BUREAU_MONTHS_BALANCE_MEAN_MEAN","BUREAU_MONTHS_BALANCE_MEAN_VAR",
            "BUREAU_MONTHS_BALANCE_SIZE_MEAN","BUREAU_MONTHS_BALANCE_SIZE_SUM",
            "BUREAU_STATUS_0_MEAN","BUREAU_STATUS_1_MEAN","BUREAU_STATUS_12345_MEAN",
            "BUREAU_STATUS_C_MEAN","BUREAU_STATUS_X_MEAN",
            "BUREAU_CREDIT_ACTIVE_Active_MEAN","BUREAU_CREDIT_ACTIVE_Closed_MEAN",
            "BUREAU_CREDIT_ACTIVE_Sold_MEAN",
            "BUREAU_CREDIT_TYPE_Consumer credit_MEAN",
            "BUREAU_CREDIT_TYPE_Credit card_MEAN","BUREAU_CREDIT_TYPE_Car loan_MEAN",
            "BUREAU_CREDIT_TYPE_Mortgage_MEAN","BUREAU_CREDIT_TYPE_Microloan_MEAN",
            "BUREAU_LL_AMT_CREDIT_SUM_OVERDUE_MEAN","BUREAU_LL_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_LL_STATUS_12345_MEAN","BUREAU_ACTIVE_DAYS_CREDIT_MAX",
            "BUREAU_ACTIVE_DAYS_CREDIT_MEAN","BUREAU_ACTIVE_DAYS_CREDIT_ENDDATE_MIN",
            "BUREAU_ACTIVE_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_ACTIVE_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_ACTIVE_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_ACTIVE_AMT_CREDIT_SUM_MAX","BUREAU_ACTIVE_AMT_CREDIT_SUM_SUM",
            "BUREAU_ACTIVE_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_ACTIVE_AMT_CREDIT_SUM_DEBT_SUM",
            "BUREAU_ACTIVE_AMT_CREDIT_SUM_OVERDUE_MAX",
            "BUREAU_ACTIVE_AMT_CREDIT_SUM_OVERDUE_MEAN",
            "BUREAU_ACTIVE_DAYS_CREDIT_UPDATE_MIN",
            "BUREAU_ACTIVE_DAYS_CREDIT_UPDATE_MEAN",
            "BUREAU_ACTIVE_DEBT_PERCENTAGE_MEAN",
            "BUREAU_ACTIVE_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_ACTIVE_CREDIT_TO_ANNUITY_RATIO_MEAN",
            "BUREAU_ACTIVE_MONTHS_BALANCE_MEAN_MEAN",
            "BUREAU_ACTIVE_MONTHS_BALANCE_MEAN_VAR",
            "BUREAU_ACTIVE_MONTHS_BALANCE_SIZE_MEAN",
            "BUREAU_ACTIVE_MONTHS_BALANCE_SIZE_SUM","BUREAU_CLOSED_DAYS_CREDIT_MAX",
            "BUREAU_CLOSED_DAYS_CREDIT_VAR","BUREAU_CLOSED_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_CLOSED_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_CLOSED_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_CLOSED_AMT_CREDIT_SUM_OVERDUE_MEAN",
            "BUREAU_CLOSED_AMT_CREDIT_SUM_MAX","BUREAU_CLOSED_AMT_CREDIT_SUM_MEAN",
            "BUREAU_CLOSED_AMT_CREDIT_SUM_SUM",
            "BUREAU_CLOSED_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_CLOSED_AMT_CREDIT_SUM_DEBT_SUM",
            "BUREAU_CLOSED_DAYS_CREDIT_UPDATE_MAX","BUREAU_CLOSED_ENDDATE_DIF_MEAN",
            "BUREAU_CLOSED_STATUS_12345_MEAN","BUREAU_CONSUMER_DAYS_CREDIT_MEAN",
            "BUREAU_CONSUMER_DAYS_CREDIT_MAX",
            "BUREAU_CONSUMER_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_CONSUMER_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_CONSUMER_AMT_CREDIT_SUM_MEAN",
            "BUREAU_CONSUMER_AMT_CREDIT_SUM_MAX",
            "BUREAU_CONSUMER_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_CONSUMER_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_CONSUMER_DEBT_PERCENTAGE_MEAN",
            "BUREAU_CONSUMER_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_CONSUMER_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_CREDIT_DAYS_CREDIT_MEAN","BUREAU_CREDIT_DAYS_CREDIT_MAX",
            "BUREAU_CREDIT_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_CREDIT_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_CREDIT_AMT_CREDIT_SUM_MEAN","BUREAU_CREDIT_AMT_CREDIT_SUM_MAX",
            "BUREAU_CREDIT_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_CREDIT_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_CREDIT_DEBT_PERCENTAGE_MEAN",
            "BUREAU_CREDIT_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_CREDIT_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_MORTGAGE_DAYS_CREDIT_MEAN","BUREAU_MORTGAGE_DAYS_CREDIT_MAX",
            "BUREAU_MORTGAGE_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_MORTGAGE_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_MORTGAGE_AMT_CREDIT_SUM_MEAN",
            "BUREAU_MORTGAGE_AMT_CREDIT_SUM_MAX",
            "BUREAU_MORTGAGE_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_MORTGAGE_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_MORTGAGE_DEBT_PERCENTAGE_MEAN",
            "BUREAU_MORTGAGE_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_MORTGAGE_DAYS_CREDIT_ENDDATE_MAX","BUREAU_CAR_DAYS_CREDIT_MEAN",
            "BUREAU_CAR_DAYS_CREDIT_MAX","BUREAU_CAR_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_CAR_AMT_CREDIT_MAX_OVERDUE_MAX","BUREAU_CAR_AMT_CREDIT_SUM_MEAN",
            "BUREAU_CAR_AMT_CREDIT_SUM_MAX","BUREAU_CAR_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_CAR_AMT_CREDIT_SUM_DEBT_MAX","BUREAU_CAR_DEBT_PERCENTAGE_MEAN",
            "BUREAU_CAR_DEBT_CREDIT_DIFF_MEAN","BUREAU_CAR_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_MICROLOAN_DAYS_CREDIT_MEAN","BUREAU_MICROLOAN_DAYS_CREDIT_MAX",
            "BUREAU_MICROLOAN_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_MICROLOAN_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_MICROLOAN_AMT_CREDIT_SUM_MEAN",
            "BUREAU_MICROLOAN_AMT_CREDIT_SUM_MAX",
            "BUREAU_MICROLOAN_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_MICROLOAN_AMT_CREDIT_SUM_DEBT_MAX",
            "BUREAU_MICROLOAN_DEBT_PERCENTAGE_MEAN",
            "BUREAU_MICROLOAN_DEBT_CREDIT_DIFF_MEAN",
            "BUREAU_MICROLOAN_DAYS_CREDIT_ENDDATE_MAX",
            "BUREAU_LAST6M_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_LAST6M_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_LAST6M_AMT_CREDIT_SUM_OVERDUE_MEAN",
            "BUREAU_LAST6M_AMT_CREDIT_SUM_MAX","BUREAU_LAST6M_AMT_CREDIT_SUM_SUM",
            "BUREAU_LAST6M_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_LAST6M_AMT_CREDIT_SUM_DEBT_SUM",
            "BUREAU_LAST6M_DEBT_PERCENTAGE_MEAN",
            "BUREAU_LAST6M_DEBT_CREDIT_DIFF_MEAN","BUREAU_LAST6M_STATUS_0_MEAN",
            "BUREAU_LAST6M_STATUS_12345_MEAN",
            "BUREAU_LAST12M_AMT_CREDIT_MAX_OVERDUE_MAX",
            "BUREAU_LAST12M_AMT_CREDIT_MAX_OVERDUE_MEAN",
            "BUREAU_LAST12M_AMT_CREDIT_SUM_OVERDUE_MEAN",
            "BUREAU_LAST12M_AMT_CREDIT_SUM_MAX","BUREAU_LAST12M_AMT_CREDIT_SUM_SUM",
            "BUREAU_LAST12M_AMT_CREDIT_SUM_DEBT_MEAN",
            "BUREAU_LAST12M_AMT_CREDIT_SUM_DEBT_SUM",
            "BUREAU_LAST12M_DEBT_PERCENTAGE_MEAN",
            "BUREAU_LAST12M_DEBT_CREDIT_DIFF_MEAN","BUREAU_LAST12M_STATUS_0_MEAN",
            "BUREAU_LAST12M_STATUS_12345_MEAN","AMT_CREDIT_MAX_OVERDUE",
            "BUREAU_DEBT_OVER_CREDIT","BUREAU_ACTIVE_DEBT_OVER_CREDIT"};


    public static final String[] PREVIOUS_APPLICATIONS = {
            "APPROVED_AMT_ANNUITY_MAX", "APPROVED_AMT_ANNUITY_MEAN", "APPROVED_AMT_ANNUITY_MIN",
            "APPROVED_AMT_CREDIT_MAX", "APPROVED_AMT_CREDIT_MEAN", "APPROVED_AMT_CREDIT_MIN",
            "APPROVED_AMT_DOWN_PAYMENT_MAX", "APPROVED_AMT_GOODS_PRICE_MAX", "APPROVED_APPLICATION_CREDIT_DIFF_MAX",
            "APPROVED_APPLICATION_CREDIT_RATIO_MAX", "APPROVED_APPLICATION_CREDIT_RATIO_MEAN",
            "APPROVED_APPLICATION_CREDIT_RATIO_MIN", "APPROVED_CNT_PAYMENT_MAX", "APPROVED_CNT_PAYMENT_MEAN",
            "APPROVED_CREDIT_TO_ANNUITY_RATIO_MAX", "APPROVED_CREDIT_TO_ANNUITY_RATIO_MEAN",
            "APPROVED_DAYS_DECISION_MEAN", "APPROVED_DAYS_DECISION_MIN", "APPROVED_DAYS_FIRST_DRAWING_MAX",
            "APPROVED_DAYS_FIRST_DRAWING_MEAN", "APPROVED_DAYS_FIRST_DUE_MEAN", "APPROVED_DAYS_FIRST_DUE_MIN",
            "APPROVED_DAYS_LAST_DUE_1ST_VERSION_MAX", "APPROVED_DAYS_LAST_DUE_1ST_VERSION_MEAN",
            "APPROVED_DAYS_LAST_DUE_1ST_VERSION_MIN", "APPROVED_DAYS_LAST_DUE_DIFF_MAX",
            "APPROVED_DAYS_LAST_DUE_DIFF_MEAN", "APPROVED_DAYS_LAST_DUE_DIFF_MIN", "APPROVED_DAYS_LAST_DUE_MAX",
            "APPROVED_DAYS_LAST_DUE_MEAN", "APPROVED_DAYS_TERMINATION_MEAN", "APPROVED_HOUR_APPR_PROCESS_START_MAX",
            "APPROVED_HOUR_APPR_PROCESS_START_MIN", "APPROVED_SIMPLE_INTERESTS_MAX", "APPROVED_SIMPLE_INTERESTS_MEAN",
            "APPROVED_SIMPLE_INTERESTS_MIN", "APPROVED_SK_ID_PREV_NUNIQUE", "PREV_ACTIVE_AMT_ANNUITY_MAX",
            "PREV_ACTIVE_AMT_ANNUITY_SUM", "PREV_ACTIVE_AMT_APPLICATION_MAX", "PREV_ACTIVE_AMT_APPLICATION_MEAN",
            "PREV_ACTIVE_AMT_CREDIT_SUM", "PREV_ACTIVE_AMT_DOWN_PAYMENT_MAX", "PREV_ACTIVE_AMT_DOWN_PAYMENT_MEAN",
            "PREV_ACTIVE_AMT_PAYMENT_SUM", "PREV_ACTIVE_CNT_PAYMENT_MEAN", "PREV_ACTIVE_CNT_PAYMENT_SUM",
            "PREV_ACTIVE_DAYS_DECISION_MEAN", "PREV_ACTIVE_DAYS_DECISION_MIN",
            "PREV_ACTIVE_DAYS_LAST_DUE_1ST_VERSION_MAX", "PREV_ACTIVE_DAYS_LAST_DUE_1ST_VERSION_MEAN",
            "PREV_ACTIVE_DAYS_LAST_DUE_1ST_VERSION_MIN", "PREV_ACTIVE_INSTALMENT_PAYMENT_DIFF_MAX",
            "PREV_ACTIVE_INSTALMENT_PAYMENT_DIFF_MEAN", "PREV_ACTIVE_REMAINING_DEBT_MAX",
            "PREV_ACTIVE_REMAINING_DEBT_MEAN", "PREV_ACTIVE_REMAINING_DEBT_SUM", "PREV_ACTIVE_REPAYMENT_RATIO_MEAN",
            "PREV_ACTIVE_SIMPLE_INTERESTS_MEAN", "PREV_ACTIVE_SK_ID_PREV_NUNIQUE", "PREV_AMT_ANNUITY_MAX",
            "PREV_AMT_ANNUITY_MEAN", "PREV_AMT_ANNUITY_MIN", "PREV_AMT_DOWN_PAYMENT_MAX", "PREV_AMT_DOWN_PAYMENT_MEAN",
            "PREV_APPLICATION_CREDIT_DIFF_MAX", "PREV_APPLICATION_CREDIT_DIFF_MEAN", "PREV_APPLICATION_CREDIT_DIFF_MIN",
            "PREV_APPLICATION_CREDIT_RATIO_MAX", "PREV_APPLICATION_CREDIT_RATIO_MEAN",
            "PREV_APPLICATION_CREDIT_RATIO_MIN", "PREV_APPLICATION_CREDIT_RATIO_VAR",
            "PREV_CHANNEL_TYPE_AP+ (Cash loan)_MEAN", "PREV_CHANNEL_TYPE_Car dealer_MEAN",
            "PREV_CHANNEL_TYPE_Channel of corporate sales_MEAN", "PREV_CHANNEL_TYPE_Contact center_MEAN",
            "PREV_CHANNEL_TYPE_Country-wide_MEAN", "PREV_CHANNEL_TYPE_Credit and cash offices_MEAN",
            "PREV_CHANNEL_TYPE_Regional / Local_MEAN", "PREV_CHANNEL_TYPE_Stone_MEAN", "PREV_CNT_PAYMENT_MAX",
            "PREV_CNT_PAYMENT_MEAN", "PREV_CREDIT_TO_ANNUITY_RATIO_MAX", "PREV_CREDIT_TO_ANNUITY_RATIO_MEAN",
            "PREV_Cash_AMT_ANNUITY_MAX", "PREV_Cash_AMT_ANNUITY_MEAN", "PREV_Cash_AMT_CREDIT_SUM",
            "PREV_Cash_APPLICATION_CREDIT_DIFF_MIN", "PREV_Cash_APPLICATION_CREDIT_DIFF_VAR",
            "PREV_Cash_APPLICATION_CREDIT_RATIO_MAX", "PREV_Cash_APPLICATION_CREDIT_RATIO_MEAN",
            "PREV_Cash_APPLICATION_CREDIT_RATIO_MIN", "PREV_Cash_CNT_PAYMENT_MEAN", "PREV_Cash_DAYS_DECISION_MAX",
            "PREV_Cash_DAYS_LAST_DUE_1ST_VERSION_MAX", "PREV_Cash_DAYS_LAST_DUE_1ST_VERSION_MEAN",
            "PREV_Cash_SIMPLE_INTERESTS_MAX", "PREV_Cash_SIMPLE_INTERESTS_MEAN", "PREV_Cash_SIMPLE_INTERESTS_MIN",
            "PREV_Cash_SIMPLE_INTERESTS_VAR", "PREV_Consumer_AMT_ANNUITY_MAX", "PREV_Consumer_AMT_ANNUITY_MEAN",
            "PREV_Consumer_AMT_CREDIT_SUM", "PREV_Consumer_APPLICATION_CREDIT_DIFF_MIN",
            "PREV_Consumer_APPLICATION_CREDIT_DIFF_VAR", "PREV_Consumer_APPLICATION_CREDIT_RATIO_MAX",
            "PREV_Consumer_APPLICATION_CREDIT_RATIO_MEAN", "PREV_Consumer_APPLICATION_CREDIT_RATIO_MIN",
            "PREV_Consumer_CNT_PAYMENT_MEAN", "PREV_Consumer_DAYS_DECISION_MAX",
            "PREV_Consumer_DAYS_LAST_DUE_1ST_VERSION_MAX", "PREV_Consumer_DAYS_LAST_DUE_1ST_VERSION_MEAN",
            "PREV_Consumer_SIMPLE_INTERESTS_MAX", "PREV_Consumer_SIMPLE_INTERESTS_MEAN",
            "PREV_Consumer_SIMPLE_INTERESTS_MIN", "PREV_Consumer_SIMPLE_INTERESTS_VAR", "PREV_DAYS_DECISION_MAX",
            "PREV_DAYS_DECISION_MEAN", "PREV_DAYS_DECISION_MIN", "PREV_DAYS_TERMINATION_MAX",
            "PREV_DOWN_PAYMENT_TO_CREDIT_MEAN", "PREV_HOUR_APPR_PROCESS_START_MAX", "PREV_HOUR_APPR_PROCESS_START_MEAN",
            "PREV_HOUR_APPR_PROCESS_START_MIN", "PREV_LAST12M_AMT_ANNUITY_MAX", "PREV_LAST12M_AMT_ANNUITY_MEAN",
            "PREV_LAST12M_AMT_CREDIT_SUM", "PREV_LAST12M_APPLICATION_CREDIT_DIFF_MIN",
            "PREV_LAST12M_APPLICATION_CREDIT_RATIO_MAX", "PREV_LAST12M_APPLICATION_CREDIT_RATIO_MEAN",
            "PREV_LAST12M_APPLICATION_CREDIT_RATIO_MIN", "PREV_LAST12M_DAYS_DECISION_MEAN",
            "PREV_LAST12M_DAYS_DECISION_MIN", "PREV_LAST12M_DAYS_LAST_DUE_1ST_VERSION_MAX",
            "PREV_LAST12M_DAYS_LAST_DUE_1ST_VERSION_MEAN", "PREV_LAST12M_DAYS_LAST_DUE_1ST_VERSION_MIN",
            "PREV_LAST12M_NAME_CONTRACT_TYPE_Cash loans_MEAN", "PREV_LAST12M_NAME_CONTRACT_TYPE_Consumer loans_MEAN",
            "PREV_LAST12M_NAME_CONTRACT_TYPE_Revolving loans_MEAN", "PREV_LAST12M_SIMPLE_INTERESTS_MAX",
            "PREV_LAST12M_SIMPLE_INTERESTS_MEAN", "PREV_LAST24M_AMT_ANNUITY_MAX", "PREV_LAST24M_AMT_ANNUITY_MEAN",
            "PREV_LAST24M_AMT_CREDIT_SUM", "PREV_LAST24M_APPLICATION_CREDIT_DIFF_MIN",
            "PREV_LAST24M_APPLICATION_CREDIT_RATIO_MAX", "PREV_LAST24M_APPLICATION_CREDIT_RATIO_MEAN",
            "PREV_LAST24M_APPLICATION_CREDIT_RATIO_MIN", "PREV_LAST24M_DAYS_DECISION_MEAN",
            "PREV_LAST24M_DAYS_DECISION_MIN", "PREV_LAST24M_DAYS_LAST_DUE_1ST_VERSION_MAX",
            "PREV_LAST24M_DAYS_LAST_DUE_1ST_VERSION_MEAN", "PREV_LAST24M_DAYS_LAST_DUE_1ST_VERSION_MIN",
            "PREV_LAST24M_NAME_CONTRACT_TYPE_Cash loans_MEAN", "PREV_LAST24M_NAME_CONTRACT_TYPE_Consumer loans_MEAN",
            "PREV_LAST24M_NAME_CONTRACT_TYPE_Revolving loans_MEAN", "PREV_LAST24M_SIMPLE_INTERESTS_MAX",
            "PREV_LAST24M_SIMPLE_INTERESTS_MEAN", "PREV_LATE_APPLICATION_CREDIT_DIFF_MIN",
            "PREV_LATE_DAYS_DECISION_MAX", "PREV_LATE_DAYS_DECISION_MEAN", "PREV_LATE_DAYS_DECISION_MIN",
            "PREV_LATE_DAYS_LAST_DUE_1ST_VERSION_MAX", "PREV_LATE_DAYS_LAST_DUE_1ST_VERSION_MEAN",
            "PREV_LATE_DAYS_LAST_DUE_1ST_VERSION_MIN", "PREV_LATE_NAME_CONTRACT_TYPE_Cash loans_MEAN",
            "PREV_LATE_NAME_CONTRACT_TYPE_Consumer loans_MEAN", "PREV_LATE_NAME_CONTRACT_TYPE_Revolving loans_MEAN",
            "PREV_NAME_CLIENT_TYPE_New_MEAN", "PREV_NAME_CLIENT_TYPE_Refreshed_MEAN",
            "PREV_NAME_CLIENT_TYPE_Repeater_MEAN", "PREV_NAME_CLIENT_TYPE_XNA_MEAN",
            "PREV_NAME_CONTRACT_STATUS_Approved_MEAN", "PREV_NAME_CONTRACT_STATUS_Canceled_MEAN",
            "PREV_NAME_CONTRACT_STATUS_Refused_MEAN", "PREV_NAME_CONTRACT_STATUS_Unused offer_MEAN",
            "PREV_NAME_CONTRACT_TYPE_Cash loans_MEAN", "PREV_NAME_CONTRACT_TYPE_Consumer loans_MEAN",
            "PREV_NAME_CONTRACT_TYPE_Revolving loans_MEAN", "PREV_NAME_CONTRACT_TYPE_XNA_MEAN",
            "PREV_NAME_PRODUCT_TYPE_XNA_MEAN", "PREV_NAME_PRODUCT_TYPE_walk-in_MEAN",
            "PREV_NAME_PRODUCT_TYPE_x-sell_MEAN", "PREV_NAME_TYPE_SUITE_Children_MEAN",
            "PREV_NAME_TYPE_SUITE_Family_MEAN", "PREV_NAME_TYPE_SUITE_Group of people_MEAN",
            "PREV_NAME_TYPE_SUITE_Other_A_MEAN", "PREV_NAME_TYPE_SUITE_Other_B_MEAN",
            "PREV_NAME_TYPE_SUITE_Spouse, partner_MEAN", "PREV_NAME_TYPE_SUITE_Unaccompanied_MEAN",
            "PREV_NAME_YIELD_GROUP_XNA_MEAN", "PREV_NAME_YIELD_GROUP_high_MEAN",
            "PREV_NAME_YIELD_GROUP_low_action_MEAN", "PREV_NAME_YIELD_GROUP_low_normal_MEAN",
            "PREV_NAME_YIELD_GROUP_middle_MEAN", "PREV_PRODUCT_COMBINATION_Card Street_MEAN",
            "PREV_PRODUCT_COMBINATION_Card X-Sell_MEAN", "PREV_PRODUCT_COMBINATION_Cash Street: high_MEAN",
            "PREV_PRODUCT_COMBINATION_Cash Street: low_MEAN", "PREV_PRODUCT_COMBINATION_Cash Street: middle_MEAN",
            "PREV_PRODUCT_COMBINATION_Cash X-Sell: high_MEAN", "PREV_PRODUCT_COMBINATION_Cash X-Sell: low_MEAN",
            "PREV_PRODUCT_COMBINATION_Cash X-Sell: middle_MEAN", "PREV_PRODUCT_COMBINATION_Cash_MEAN",
            "PREV_PRODUCT_COMBINATION_POS household with interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS household without interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS industry with interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS industry without interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS mobile with interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS mobile without interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS other with interest_MEAN",
            "PREV_PRODUCT_COMBINATION_POS others without interest_MEAN", "PREV_RATE_DOWN_PAYMENT_MAX",
            "PREV_RATE_DOWN_PAYMENT_MEAN", "PREV_SK_ID_PREV_NUNIQUE", "REFUSED_AMT_APPLICATION_MAX",
            "REFUSED_AMT_APPLICATION_MEAN", "REFUSED_AMT_CREDIT_MAX", "REFUSED_AMT_CREDIT_MIN",
            "REFUSED_APPLICATION_CREDIT_DIFF_MAX", "REFUSED_APPLICATION_CREDIT_DIFF_MEAN",
            "REFUSED_APPLICATION_CREDIT_DIFF_MIN", "REFUSED_APPLICATION_CREDIT_DIFF_VAR",
            "REFUSED_APPLICATION_CREDIT_RATIO_MEAN", "REFUSED_APPLICATION_CREDIT_RATIO_MIN", "REFUSED_CNT_PAYMENT_MAX",
            "REFUSED_CNT_PAYMENT_MEAN", "REFUSED_DAYS_DECISION_MAX", "REFUSED_DAYS_DECISION_MEAN",
            "REFUSED_DAYS_DECISION_MIN", "REFUSED_NAME_CONTRACT_TYPE_Cash loans_MEAN",
            "REFUSED_NAME_CONTRACT_TYPE_Consumer loans_MEAN", "REFUSED_NAME_CONTRACT_TYPE_Revolving loans_MEAN",
            "SK_ID_CURR", "TOTAL_REPAYMENT_RATIO"
    };


}
