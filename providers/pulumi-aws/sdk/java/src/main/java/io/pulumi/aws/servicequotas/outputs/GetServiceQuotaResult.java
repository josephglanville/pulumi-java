// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicequotas.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceQuotaResult {
    /**
     * Whether the service quota is adjustable.
     * 
     */
    private final Boolean adjustable;
    /**
     * Amazon Resource Name (ARN) of the service quota.
     * 
     */
    private final String arn;
    /**
     * Default value of the service quota.
     * 
     */
    private final Double defaultValue;
    /**
     * Whether the service quota is global for the AWS account.
     * 
     */
    private final Boolean globalQuota;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String quotaCode;
    private final String quotaName;
    private final String serviceCode;
    /**
     * Name of the service.
     * 
     */
    private final String serviceName;
    /**
     * Current value of the service quota.
     * 
     */
    private final Double value;

    @CustomType.Constructor
    private GetServiceQuotaResult(
        @CustomType.Parameter("adjustable") Boolean adjustable,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("defaultValue") Double defaultValue,
        @CustomType.Parameter("globalQuota") Boolean globalQuota,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("quotaCode") String quotaCode,
        @CustomType.Parameter("quotaName") String quotaName,
        @CustomType.Parameter("serviceCode") String serviceCode,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("value") Double value) {
        this.adjustable = adjustable;
        this.arn = arn;
        this.defaultValue = defaultValue;
        this.globalQuota = globalQuota;
        this.id = id;
        this.quotaCode = quotaCode;
        this.quotaName = quotaName;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.value = value;
    }

    /**
     * Whether the service quota is adjustable.
     * 
    */
    public Boolean getAdjustable() {
        return this.adjustable;
    }
    /**
     * Amazon Resource Name (ARN) of the service quota.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Default value of the service quota.
     * 
    */
    public Double getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Whether the service quota is global for the AWS account.
     * 
    */
    public Boolean getGlobalQuota() {
        return this.globalQuota;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getQuotaCode() {
        return this.quotaCode;
    }
    public String getQuotaName() {
        return this.quotaName;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }
    /**
     * Name of the service.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Current value of the service quota.
     * 
    */
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceQuotaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean adjustable;
        private String arn;
        private Double defaultValue;
        private Boolean globalQuota;
        private String id;
        private String quotaCode;
        private String quotaName;
        private String serviceCode;
        private String serviceName;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceQuotaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustable = defaults.adjustable;
    	      this.arn = defaults.arn;
    	      this.defaultValue = defaults.defaultValue;
    	      this.globalQuota = defaults.globalQuota;
    	      this.id = defaults.id;
    	      this.quotaCode = defaults.quotaCode;
    	      this.quotaName = defaults.quotaName;
    	      this.serviceCode = defaults.serviceCode;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder adjustable(Boolean adjustable) {
            this.adjustable = Objects.requireNonNull(adjustable);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder defaultValue(Double defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder globalQuota(Boolean globalQuota) {
            this.globalQuota = Objects.requireNonNull(globalQuota);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder quotaCode(String quotaCode) {
            this.quotaCode = Objects.requireNonNull(quotaCode);
            return this;
        }
        public Builder quotaName(String quotaName) {
            this.quotaName = Objects.requireNonNull(quotaName);
            return this;
        }
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = Objects.requireNonNull(serviceCode);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetServiceQuotaResult build() {
            return new GetServiceQuotaResult(adjustable, arn, defaultValue, globalQuota, id, quotaCode, quotaName, serviceCode, serviceName, value);
        }
    }
}