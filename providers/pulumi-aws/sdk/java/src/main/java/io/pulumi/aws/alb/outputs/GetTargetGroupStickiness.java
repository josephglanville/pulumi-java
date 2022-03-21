// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTargetGroupStickiness {
    private final Integer cookieDuration;
    private final String cookieName;
    private final Boolean enabled;
    private final String type;

    @CustomType.Constructor
    private GetTargetGroupStickiness(
        @CustomType.Parameter("cookieDuration") Integer cookieDuration,
        @CustomType.Parameter("cookieName") String cookieName,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("type") String type) {
        this.cookieDuration = cookieDuration;
        this.cookieName = cookieName;
        this.enabled = enabled;
        this.type = type;
    }

    public Integer getCookieDuration() {
        return this.cookieDuration;
    }
    public String getCookieName() {
        return this.cookieName;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupStickiness defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cookieDuration;
        private String cookieName;
        private Boolean enabled;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieDuration = defaults.cookieDuration;
    	      this.cookieName = defaults.cookieName;
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
        }

        public Builder cookieDuration(Integer cookieDuration) {
            this.cookieDuration = Objects.requireNonNull(cookieDuration);
            return this;
        }
        public Builder cookieName(String cookieName) {
            this.cookieName = Objects.requireNonNull(cookieName);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTargetGroupStickiness build() {
            return new GetTargetGroupStickiness(cookieDuration, cookieName, enabled, type);
        }
    }
}
