// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModuleDefaultVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleDefaultVersionArgs Empty = new ModuleDefaultVersionArgs();

    /**
     * The Amazon Resource Name (ARN) of the module version to set as the default version.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of a module existing in the registry.
     * 
     */
    @Import(name="moduleName")
      private final @Nullable Output<String> moduleName;

    public Output<String> getModuleName() {
        return this.moduleName == null ? Output.empty() : this.moduleName;
    }

    /**
     * The ID of an existing version of the named module to set as the default.
     * 
     */
    @Import(name="versionId")
      private final @Nullable Output<String> versionId;

    public Output<String> getVersionId() {
        return this.versionId == null ? Output.empty() : this.versionId;
    }

    public ModuleDefaultVersionArgs(
        @Nullable Output<String> arn,
        @Nullable Output<String> moduleName,
        @Nullable Output<String> versionId) {
        this.arn = arn;
        this.moduleName = moduleName;
        this.versionId = versionId;
    }

    private ModuleDefaultVersionArgs() {
        this.arn = Output.empty();
        this.moduleName = Output.empty();
        this.versionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleDefaultVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> moduleName;
        private @Nullable Output<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleDefaultVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.moduleName = defaults.moduleName;
    	      this.versionId = defaults.versionId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder moduleName(@Nullable Output<String> moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public Builder moduleName(@Nullable String moduleName) {
            this.moduleName = Output.ofNullable(moduleName);
            return this;
        }
        public Builder versionId(@Nullable Output<String> versionId) {
            this.versionId = versionId;
            return this;
        }
        public Builder versionId(@Nullable String versionId) {
            this.versionId = Output.ofNullable(versionId);
            return this;
        }        public ModuleDefaultVersionArgs build() {
            return new ModuleDefaultVersionArgs(arn, moduleName, versionId);
        }
    }
}
