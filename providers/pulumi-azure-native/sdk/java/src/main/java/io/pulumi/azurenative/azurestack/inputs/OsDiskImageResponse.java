// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * OS disk image.
 * 
 */
public final class OsDiskImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final OsDiskImageResponse Empty = new OsDiskImageResponse();

    /**
     * OS operating system type.
     * 
     */
    @InputImport(name="operatingSystem", required=true)
      private final String operatingSystem;

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * SAS key for source blob.
     * 
     */
    @InputImport(name="sourceBlobSasUri", required=true)
      private final String sourceBlobSasUri;

    public String getSourceBlobSasUri() {
        return this.sourceBlobSasUri;
    }

    public OsDiskImageResponse(
        String operatingSystem,
        String sourceBlobSasUri) {
        this.operatingSystem = Objects.requireNonNull(operatingSystem, "expected parameter 'operatingSystem' to be non-null");
        this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri, "expected parameter 'sourceBlobSasUri' to be non-null");
    }

    private OsDiskImageResponse() {
        this.operatingSystem = null;
        this.sourceBlobSasUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operatingSystem;
        private String sourceBlobSasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.sourceBlobSasUri = defaults.sourceBlobSasUri;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }

        public Builder setSourceBlobSasUri(String sourceBlobSasUri) {
            this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri);
            return this;
        }
        public OsDiskImageResponse build() {
            return new OsDiskImageResponse(operatingSystem, sourceBlobSasUri);
        }
    }
}
