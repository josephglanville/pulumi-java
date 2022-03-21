// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectEnvironmentEnvironmentVariable {
    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    private final String name;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    private final @Nullable String type;
    /**
     * Environment variable's value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ProjectEnvironmentEnvironmentVariable(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Environment variable's value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentEnvironmentVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentEnvironmentVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ProjectEnvironmentEnvironmentVariable build() {
            return new ProjectEnvironmentEnvironmentVariable(name, type, value);
        }
    }
}
