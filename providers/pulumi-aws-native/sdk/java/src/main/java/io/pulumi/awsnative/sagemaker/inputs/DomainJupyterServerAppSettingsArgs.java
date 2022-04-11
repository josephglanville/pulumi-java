// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DomainResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JupyterServer app settings.
 * 
 */
public final class DomainJupyterServerAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainJupyterServerAppSettingsArgs Empty = new DomainJupyterServerAppSettingsArgs();

    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainResourceSpecArgs> defaultResourceSpec;

    public Output<DomainResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Codegen.empty() : this.defaultResourceSpec;
    }

    public DomainJupyterServerAppSettingsArgs(@Nullable Output<DomainResourceSpecArgs> defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    private DomainJupyterServerAppSettingsArgs() {
        this.defaultResourceSpec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainJupyterServerAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainResourceSpecArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainJupyterServerAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(@Nullable Output<DomainResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public Builder defaultResourceSpec(@Nullable DomainResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Codegen.ofNullable(defaultResourceSpec);
            return this;
        }        public DomainJupyterServerAppSettingsArgs build() {
            return new DomainJupyterServerAppSettingsArgs(defaultResourceSpec);
        }
    }
}
