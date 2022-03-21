// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzPowerShellSetupResponse {
    /**
     * The type of custom setup.
     * Expected value is 'AzPowerShellSetup'.
     * 
     */
    private final String type;
    /**
     * The required version of Azure PowerShell to install.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private AzPowerShellSetupResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.type = type;
        this.version = version;
    }

    /**
     * The type of custom setup.
     * Expected value is 'AzPowerShellSetup'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The required version of Azure PowerShell to install.
     * 
    */
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public AzPowerShellSetupResponse build() {
            return new AzPowerShellSetupResponse(type, version);
        }
    }
}
