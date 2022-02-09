// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.EnvironmentSpecificationVersionResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentSpecificationVersionResult {
    private final String id;
    private final String name;
    private final EnvironmentSpecificationVersionResponse properties;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"id","name","properties","systemData","type"})
    private GetEnvironmentSpecificationVersionResult(
        String id,
        String name,
        EnvironmentSpecificationVersionResponse properties,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public EnvironmentSpecificationVersionResponse getProperties() {
        return this.properties;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentSpecificationVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private EnvironmentSpecificationVersionResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentSpecificationVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(EnvironmentSpecificationVersionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetEnvironmentSpecificationVersionResult build() {
            return new GetEnvironmentSpecificationVersionResult(id, name, properties, systemData, type);
        }
    }
}
