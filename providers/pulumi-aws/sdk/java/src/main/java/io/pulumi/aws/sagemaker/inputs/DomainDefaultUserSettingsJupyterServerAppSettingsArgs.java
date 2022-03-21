// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsJupyterServerAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsJupyterServerAppSettingsArgs Empty = new DomainDefaultUserSettingsJupyterServerAppSettingsArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
      private final @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Output<DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Output.empty() : this.defaultResourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    @Import(name="lifecycleConfigArns")
      private final @Nullable Output<List<String>> lifecycleConfigArns;

    public Output<List<String>> getLifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? Output.empty() : this.lifecycleConfigArns;
    }

    public DomainDefaultUserSettingsJupyterServerAppSettingsArgs(
        @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec,
        @Nullable Output<List<String>> lifecycleConfigArns) {
        this.defaultResourceSpec = defaultResourceSpec;
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    private DomainDefaultUserSettingsJupyterServerAppSettingsArgs() {
        this.defaultResourceSpec = Output.empty();
        this.lifecycleConfigArns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsJupyterServerAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;
        private @Nullable Output<List<String>> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsJupyterServerAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public Builder defaultResourceSpec(@Nullable DomainDefaultUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Output.ofNullable(defaultResourceSpec);
            return this;
        }
        public Builder lifecycleConfigArns(@Nullable Output<List<String>> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }
        public Builder lifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {
            this.lifecycleConfigArns = Output.ofNullable(lifecycleConfigArns);
            return this;
        }
        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }        public DomainDefaultUserSettingsJupyterServerAppSettingsArgs build() {
            return new DomainDefaultUserSettingsJupyterServerAppSettingsArgs(defaultResourceSpec, lifecycleConfigArns);
        }
    }
}
