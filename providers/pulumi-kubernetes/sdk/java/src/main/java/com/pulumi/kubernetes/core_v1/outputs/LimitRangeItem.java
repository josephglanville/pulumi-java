// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LimitRangeItem {
    /**
     * @return Default resource requirement limit value by resource name if resource limit is omitted.
     * 
     */
    private final @Nullable Map<String,String> default_;
    /**
     * @return DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
     * 
     */
    private final @Nullable Map<String,String> defaultRequest;
    /**
     * @return Max usage constraints on this kind by resource name.
     * 
     */
    private final @Nullable Map<String,String> max;
    /**
     * @return MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
     * 
     */
    private final @Nullable Map<String,String> maxLimitRequestRatio;
    /**
     * @return Min usage constraints on this kind by resource name.
     * 
     */
    private final @Nullable Map<String,String> min;
    /**
     * @return Type of resource that this limit applies to.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LimitRangeItem(
        @CustomType.Parameter("default") @Nullable Map<String,String> default_,
        @CustomType.Parameter("defaultRequest") @Nullable Map<String,String> defaultRequest,
        @CustomType.Parameter("max") @Nullable Map<String,String> max,
        @CustomType.Parameter("maxLimitRequestRatio") @Nullable Map<String,String> maxLimitRequestRatio,
        @CustomType.Parameter("min") @Nullable Map<String,String> min,
        @CustomType.Parameter("type") String type) {
        this.default_ = default_;
        this.defaultRequest = defaultRequest;
        this.max = max;
        this.maxLimitRequestRatio = maxLimitRequestRatio;
        this.min = min;
        this.type = type;
    }

    /**
     * @return Default resource requirement limit value by resource name if resource limit is omitted.
     * 
     */
    public Map<String,String> default_() {
        return this.default_ == null ? Map.of() : this.default_;
    }
    /**
     * @return DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
     * 
     */
    public Map<String,String> defaultRequest() {
        return this.defaultRequest == null ? Map.of() : this.defaultRequest;
    }
    /**
     * @return Max usage constraints on this kind by resource name.
     * 
     */
    public Map<String,String> max() {
        return this.max == null ? Map.of() : this.max;
    }
    /**
     * @return MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
     * 
     */
    public Map<String,String> maxLimitRequestRatio() {
        return this.maxLimitRequestRatio == null ? Map.of() : this.maxLimitRequestRatio;
    }
    /**
     * @return Min usage constraints on this kind by resource name.
     * 
     */
    public Map<String,String> min() {
        return this.min == null ? Map.of() : this.min;
    }
    /**
     * @return Type of resource that this limit applies to.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitRangeItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> default_;
        private @Nullable Map<String,String> defaultRequest;
        private @Nullable Map<String,String> max;
        private @Nullable Map<String,String> maxLimitRequestRatio;
        private @Nullable Map<String,String> min;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitRangeItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.defaultRequest = defaults.defaultRequest;
    	      this.max = defaults.max;
    	      this.maxLimitRequestRatio = defaults.maxLimitRequestRatio;
    	      this.min = defaults.min;
    	      this.type = defaults.type;
        }

        public Builder default_(@Nullable Map<String,String> default_) {
            this.default_ = default_;
            return this;
        }
        public Builder defaultRequest(@Nullable Map<String,String> defaultRequest) {
            this.defaultRequest = defaultRequest;
            return this;
        }
        public Builder max(@Nullable Map<String,String> max) {
            this.max = max;
            return this;
        }
        public Builder maxLimitRequestRatio(@Nullable Map<String,String> maxLimitRequestRatio) {
            this.maxLimitRequestRatio = maxLimitRequestRatio;
            return this;
        }
        public Builder min(@Nullable Map<String,String> min) {
            this.min = min;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LimitRangeItem build() {
            return new LimitRangeItem(default_, defaultRequest, max, maxLimitRequestRatio, min, type);
        }
    }
}
