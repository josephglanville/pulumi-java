// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.deploymentmanager.outputs.DeploymentTargetConfig;
import io.pulumi.gcp.deploymentmanager.outputs.DeploymentTargetImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentTarget {
    /**
     * The root configuration file to use for this deployment.
     * Structure is documented below.
     * 
     */
    private final DeploymentTargetConfig config;
    /**
     * Specifies import files for this configuration. This can be
     * used to import templates or other files. For example, you might
     * import a text file in order to use the file in a template.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<DeploymentTargetImport> imports;

    @CustomType.Constructor
    private DeploymentTarget(
        @CustomType.Parameter("config") DeploymentTargetConfig config,
        @CustomType.Parameter("imports") @Nullable List<DeploymentTargetImport> imports) {
        this.config = config;
        this.imports = imports;
    }

    /**
     * The root configuration file to use for this deployment.
     * Structure is documented below.
     * 
    */
    public DeploymentTargetConfig getConfig() {
        return this.config;
    }
    /**
     * Specifies import files for this configuration. This can be
     * used to import templates or other files. For example, you might
     * import a text file in order to use the file in a template.
     * Structure is documented below.
     * 
    */
    public List<DeploymentTargetImport> getImports() {
        return this.imports == null ? List.of() : this.imports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTargetConfig config;
        private @Nullable List<DeploymentTargetImport> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder config(DeploymentTargetConfig config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder imports(@Nullable List<DeploymentTargetImport> imports) {
            this.imports = imports;
            return this;
        }
        public Builder imports(DeploymentTargetImport... imports) {
            return imports(List.of(imports));
        }        public DeploymentTarget build() {
            return new DeploymentTarget(config, imports);
        }
    }
}
