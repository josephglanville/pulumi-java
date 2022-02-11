// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AllowedFlexVolume {
    private final String driver;

    @OutputCustomType.Constructor({"driver"})
    private AllowedFlexVolume(String driver) {
        this.driver = Objects.requireNonNull(driver);
    }

    public String getDriver() {
        return this.driver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedFlexVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedFlexVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        public Builder setDriver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public AllowedFlexVolume build() {
            return new AllowedFlexVolume(driver);
        }
    }
}
