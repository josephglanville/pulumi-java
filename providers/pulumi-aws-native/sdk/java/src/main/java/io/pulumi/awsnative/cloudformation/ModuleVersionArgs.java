// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ModuleVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleVersionArgs Empty = new ModuleVersionArgs();

    /**
     * The name of the module being registered.
     * 
     * Recommended module naming pattern: company_or_organization::service::type::MODULE.
     * 
     */
    @Import(name="moduleName", required=true)
      private final Output<String> moduleName;

    public Output<String> getModuleName() {
        return this.moduleName;
    }

    /**
     * The url to the S3 bucket containing the schema and template fragment for the module you want to register.
     * 
     */
    @Import(name="modulePackage", required=true)
      private final Output<String> modulePackage;

    public Output<String> getModulePackage() {
        return this.modulePackage;
    }

    public ModuleVersionArgs(
        Output<String> moduleName,
        Output<String> modulePackage) {
        this.moduleName = Objects.requireNonNull(moduleName, "expected parameter 'moduleName' to be non-null");
        this.modulePackage = Objects.requireNonNull(modulePackage, "expected parameter 'modulePackage' to be non-null");
    }

    private ModuleVersionArgs() {
        this.moduleName = Codegen.empty();
        this.modulePackage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> moduleName;
        private Output<String> modulePackage;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moduleName = defaults.moduleName;
    	      this.modulePackage = defaults.modulePackage;
        }

        public Builder moduleName(Output<String> moduleName) {
            this.moduleName = Objects.requireNonNull(moduleName);
            return this;
        }
        public Builder moduleName(String moduleName) {
            this.moduleName = Output.of(Objects.requireNonNull(moduleName));
            return this;
        }
        public Builder modulePackage(Output<String> modulePackage) {
            this.modulePackage = Objects.requireNonNull(modulePackage);
            return this;
        }
        public Builder modulePackage(String modulePackage) {
            this.modulePackage = Output.of(Objects.requireNonNull(modulePackage));
            return this;
        }        public ModuleVersionArgs build() {
            return new ModuleVersionArgs(moduleName, modulePackage);
        }
    }
}
