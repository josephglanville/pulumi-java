// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.azurenative.media.outputs.TransformOutputResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransformResult {
    private final String created;
    private final @Nullable String description;
    private final String id;
    private final String lastModified;
    private final String name;
    private final List<TransformOutputResponse> outputs;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"created","description","id","lastModified","name","outputs","systemData","type"})
    private GetTransformResult(
        String created,
        @Nullable String description,
        String id,
        String lastModified,
        String name,
        List<TransformOutputResponse> outputs,
        SystemDataResponse systemData,
        String type) {
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.outputs = Objects.requireNonNull(outputs);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getCreated() {
        return this.created;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getId() {
        return this.id;
    }
    public String getLastModified() {
        return this.lastModified;
    }
    public String getName() {
        return this.name;
    }
    public List<TransformOutputResponse> getOutputs() {
        return this.outputs;
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

    public static Builder builder(GetTransformResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private List<TransformOutputResponse> outputs;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransformResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputs(List<TransformOutputResponse> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
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

        public GetTransformResult build() {
            return new GetTransformResult(created, description, id, lastModified, name, outputs, systemData, type);
        }
    }
}
