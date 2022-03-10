// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentAllSetting {
    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    private final String name;
    private final String namespace;
    private final @Nullable String resource;
    private final String value;

    @OutputCustomType.Constructor
    private EnvironmentAllSetting(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("namespace") String namespace,
        @OutputCustomType.Parameter("resource") @Nullable String resource,
        @OutputCustomType.Parameter("value") String value) {
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.value = value;
    }

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getNamespace() {
        return this.namespace;
    }
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentAllSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private @Nullable String resource;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentAllSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public EnvironmentAllSetting build() {
            return new EnvironmentAllSetting(name, namespace, resource, value);
        }
    }
}
