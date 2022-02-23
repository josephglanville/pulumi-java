// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pipeline reference type.
 * 
 */
public final class PipelineReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineReferenceResponse Empty = new PipelineReferenceResponse();

    /**
     * Reference name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Reference pipeline name.
     * 
     */
    @InputImport(name="referenceName", required=true)
      private final String referenceName;

    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Pipeline reference type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PipelineReferenceResponse(
        @Nullable String name,
        String referenceName,
        String type) {
        this.name = name;
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PipelineReferenceResponse() {
        this.name = null;
        this.referenceName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
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
        public PipelineReferenceResponse build() {
            return new PipelineReferenceResponse(name, referenceName, type);
        }
    }
}
