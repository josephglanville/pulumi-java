// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabricksSparkJarActivityResponse {
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    private final @Nullable String description;
    private final @Nullable List<Map<String,Object>> libraries;
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    private final Object mainClassName;
    private final String name;
    private final @Nullable List<Object> parameters;
    private final @Nullable ActivityPolicyResponse policy;
    private final String type;
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"dependsOn","description","libraries","linkedServiceName","mainClassName","name","parameters","policy","type","userProperties"})
    private DatabricksSparkJarActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable List<Map<String,Object>> libraries,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        Object mainClassName,
        String name,
        @Nullable List<Object> parameters,
        @Nullable ActivityPolicyResponse policy,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.libraries = libraries;
        this.linkedServiceName = linkedServiceName;
        this.mainClassName = Objects.requireNonNull(mainClassName);
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.policy = policy;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<Map<String,Object>> getLibraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    public Object getMainClassName() {
        return this.mainClassName;
    }
    public String getName() {
        return this.name;
    }
    public List<Object> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public String getType() {
        return this.type;
    }
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksSparkJarActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable List<Map<String,Object>> libraries;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private Object mainClassName;
        private String name;
        private @Nullable List<Object> parameters;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksSparkJarActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.libraries = defaults.libraries;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mainClassName = defaults.mainClassName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLibraries(@Nullable List<Map<String,Object>> libraries) {
            this.libraries = libraries;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setMainClassName(Object mainClassName) {
            this.mainClassName = Objects.requireNonNull(mainClassName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable List<Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public DatabricksSparkJarActivityResponse build() {
            return new DatabricksSparkJarActivityResponse(dependsOn, description, libraries, linkedServiceName, mainClassName, name, parameters, policy, type, userProperties);
        }
    }
}
