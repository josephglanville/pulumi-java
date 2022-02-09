// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class Gen2StorageConfigurationOutputResponse {
    private final String accountName;

    @OutputCustomType.Constructor({"accountName"})
    private Gen2StorageConfigurationOutputResponse(String accountName) {
        this.accountName = Objects.requireNonNull(accountName);
    }

    public String getAccountName() {
        return this.accountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Gen2StorageConfigurationOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(Gen2StorageConfigurationOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Gen2StorageConfigurationOutputResponse build() {
            return new Gen2StorageConfigurationOutputResponse(accountName);
        }
    }
}
