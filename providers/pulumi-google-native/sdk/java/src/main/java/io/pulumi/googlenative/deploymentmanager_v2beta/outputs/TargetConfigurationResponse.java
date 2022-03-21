// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.ConfigFileResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.ImportFileResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TargetConfigurationResponse {
    /**
     * The configuration to use for this deployment.
     * 
     */
    private final ConfigFileResponse config;
    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
     */
    private final List<ImportFileResponse> imports;

    @CustomType.Constructor
    private TargetConfigurationResponse(
        @CustomType.Parameter("config") ConfigFileResponse config,
        @CustomType.Parameter("imports") List<ImportFileResponse> imports) {
        this.config = config;
        this.imports = imports;
    }

    /**
     * The configuration to use for this deployment.
     * 
    */
    public ConfigFileResponse getConfig() {
        return this.config;
    }
    /**
     * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
     * 
    */
    public List<ImportFileResponse> getImports() {
        return this.imports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigFileResponse config;
        private List<ImportFileResponse> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder config(ConfigFileResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder imports(List<ImportFileResponse> imports) {
            this.imports = Objects.requireNonNull(imports);
            return this;
        }
        public Builder imports(ImportFileResponse... imports) {
            return imports(List.of(imports));
        }        public TargetConfigurationResponse build() {
            return new TargetConfigurationResponse(config, imports);
        }
    }
}
