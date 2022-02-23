// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="moduleName", required=true)
      private final Input<String> moduleName;

    public Input<String> getModuleName() {
        return this.moduleName;
    }

    /**
     * The url to the S3 bucket containing the schema and template fragment for the module you want to register.
     * 
     */
    @InputImport(name="modulePackage", required=true)
      private final Input<String> modulePackage;

    public Input<String> getModulePackage() {
        return this.modulePackage;
    }

    public ModuleVersionArgs(
        Input<String> moduleName,
        Input<String> modulePackage) {
        this.moduleName = Objects.requireNonNull(moduleName, "expected parameter 'moduleName' to be non-null");
        this.modulePackage = Objects.requireNonNull(modulePackage, "expected parameter 'modulePackage' to be non-null");
    }

    private ModuleVersionArgs() {
        this.moduleName = Input.empty();
        this.modulePackage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> moduleName;
        private Input<String> modulePackage;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moduleName = defaults.moduleName;
    	      this.modulePackage = defaults.modulePackage;
        }

        public Builder setModuleName(Input<String> moduleName) {
            this.moduleName = Objects.requireNonNull(moduleName);
            return this;
        }

        public Builder setModuleName(String moduleName) {
            this.moduleName = Input.of(Objects.requireNonNull(moduleName));
            return this;
        }

        public Builder setModulePackage(Input<String> modulePackage) {
            this.modulePackage = Objects.requireNonNull(modulePackage);
            return this;
        }

        public Builder setModulePackage(String modulePackage) {
            this.modulePackage = Input.of(Objects.requireNonNull(modulePackage));
            return this;
        }
        public ModuleVersionArgs build() {
            return new ModuleVersionArgs(moduleName, modulePackage);
        }
    }
}
