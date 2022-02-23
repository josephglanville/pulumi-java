// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dataset reference type.
 * 
 */
public final class DatasetReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatasetReferenceResponse Empty = new DatasetReferenceResponse();

    /**
     * Arguments for dataset.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Map<String,Object> parameters;

    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Reference dataset name.
     * 
     */
    @InputImport(name="referenceName", required=true)
      private final String referenceName;

    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Dataset reference type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DatasetReferenceResponse(
        @Nullable Map<String,Object> parameters,
        String referenceName,
        String type) {
        this.parameters = parameters;
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DatasetReferenceResponse() {
        this.parameters = Map.of();
        this.referenceName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DatasetReferenceResponse build() {
            return new DatasetReferenceResponse(parameters, referenceName, type);
        }
    }
}
