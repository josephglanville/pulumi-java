// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongoDbAtlasLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final MongoDbAtlasLinkedServiceResponse Empty = new MongoDbAtlasLinkedServiceResponse();

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    @InputImport(name="connectionString", required=true)
    private final Object connectionString;

    public Object getConnectionString() {
        return this.connectionString;
    }

    @InputImport(name="database", required=true)
    private final Object database;

    public Object getDatabase() {
        return this.database;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public MongoDbAtlasLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object connectionString,
        Object database,
        @Nullable String description,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MongoDbAtlasLinkedServiceResponse() {
        this.annotations = List.of();
        this.connectVia = null;
        this.connectionString = null;
        this.database = null;
        this.description = null;
        this.parameters = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbAtlasLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object connectionString;
        private Object database;
        private @Nullable String description;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbAtlasLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionString(Object connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setDatabase(Object database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MongoDbAtlasLinkedServiceResponse build() {
            return new MongoDbAtlasLinkedServiceResponse(annotations, connectVia, connectionString, database, description, parameters, type);
        }
    }
}
