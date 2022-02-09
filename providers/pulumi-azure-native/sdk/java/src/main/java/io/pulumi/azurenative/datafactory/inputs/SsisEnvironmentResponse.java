// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SsisVariableResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SsisEnvironmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final SsisEnvironmentResponse Empty = new SsisEnvironmentResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="folderId")
    private final @Nullable Double folderId;

    public Optional<Double> getFolderId() {
        return this.folderId == null ? Optional.empty() : Optional.ofNullable(this.folderId);
    }

    @InputImport(name="id")
    private final @Nullable Double id;

    public Optional<Double> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="variables")
    private final @Nullable List<SsisVariableResponse> variables;

    public List<SsisVariableResponse> getVariables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public SsisEnvironmentResponse(
        @Nullable String description,
        @Nullable Double folderId,
        @Nullable Double id,
        @Nullable String name,
        String type,
        @Nullable List<SsisVariableResponse> variables) {
        this.description = description;
        this.folderId = folderId;
        this.id = id;
        this.name = name;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.variables = variables;
    }

    private SsisEnvironmentResponse() {
        this.description = null;
        this.folderId = null;
        this.id = null;
        this.name = null;
        this.type = null;
        this.variables = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisEnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Double folderId;
        private @Nullable Double id;
        private @Nullable String name;
        private String type;
        private @Nullable List<SsisVariableResponse> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisEnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.variables = defaults.variables;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolderId(@Nullable Double folderId) {
            this.folderId = folderId;
            return this;
        }

        public Builder setId(@Nullable Double id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVariables(@Nullable List<SsisVariableResponse> variables) {
            this.variables = variables;
            return this;
        }

        public SsisEnvironmentResponse build() {
            return new SsisEnvironmentResponse(description, folderId, id, name, type, variables);
        }
    }
}
