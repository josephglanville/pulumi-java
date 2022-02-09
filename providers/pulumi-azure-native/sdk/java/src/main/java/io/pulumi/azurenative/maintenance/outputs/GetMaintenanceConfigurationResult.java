// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMaintenanceConfigurationResult {
    private final @Nullable Map<String,String> extensionProperties;
    private final String id;
    private final @Nullable String location;
    private final @Nullable String maintenanceScope;
    private final String name;
    private final @Nullable String namespace;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"extensionProperties","id","location","maintenanceScope","name","namespace","tags","type"})
    private GetMaintenanceConfigurationResult(
        @Nullable Map<String,String> extensionProperties,
        String id,
        @Nullable String location,
        @Nullable String maintenanceScope,
        String name,
        @Nullable String namespace,
        @Nullable Map<String,String> tags,
        String type) {
        this.extensionProperties = extensionProperties;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.maintenanceScope = maintenanceScope;
        this.name = Objects.requireNonNull(name);
        this.namespace = namespace;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Map<String,String> getExtensionProperties() {
        return this.extensionProperties == null ? Map.of() : this.extensionProperties;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> getMaintenanceScope() {
        return Optional.ofNullable(this.maintenanceScope);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> extensionProperties;
        private String id;
        private @Nullable String location;
        private @Nullable String maintenanceScope;
        private String name;
        private @Nullable String namespace;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionProperties = defaults.extensionProperties;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maintenanceScope = defaults.maintenanceScope;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setExtensionProperties(@Nullable Map<String,String> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaintenanceScope(@Nullable String maintenanceScope) {
            this.maintenanceScope = maintenanceScope;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetMaintenanceConfigurationResult build() {
            return new GetMaintenanceConfigurationResult(extensionProperties, id, location, maintenanceScope, name, namespace, tags, type);
        }
    }
}
