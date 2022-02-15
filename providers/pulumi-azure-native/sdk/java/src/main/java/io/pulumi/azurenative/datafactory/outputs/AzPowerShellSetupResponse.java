// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzPowerShellSetupResponse {
    private final String type;
    private final String version;

    @OutputCustomType.Constructor({"type","version"})
    private AzPowerShellSetupResponse(
        String type,
        String version) {
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    public String getType() {
        return this.type;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzPowerShellSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AzPowerShellSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public AzPowerShellSetupResponse build() {
            return new AzPowerShellSetupResponse(type, version);
        }
    }
}