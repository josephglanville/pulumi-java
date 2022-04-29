// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildRunBuildRunArgumentsItem {
    /**
     * @return Name of the parameter (case-sensitive). Parameter name must be ^[a-zA-Z][a-zA-Z_0-9]*$. Example: &#39;Build_Pipeline_param&#39; is not same as &#39;build_pipeline_Param&#39;
     * 
     */
    private final String name;
    /**
     * @return Value of the argument.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BuildRunBuildRunArgumentsItem(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return Name of the parameter (case-sensitive). Parameter name must be ^[a-zA-Z][a-zA-Z_0-9]*$. Example: &#39;Build_Pipeline_param&#39; is not same as &#39;build_pipeline_Param&#39;
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Value of the argument.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildRunBuildRunArgumentsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildRunBuildRunArgumentsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BuildRunBuildRunArgumentsItem build() {
            return new BuildRunBuildRunArgumentsItem(name, value);
        }
    }
}
