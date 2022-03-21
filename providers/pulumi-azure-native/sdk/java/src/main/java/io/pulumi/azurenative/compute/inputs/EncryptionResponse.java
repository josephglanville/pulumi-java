// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption at rest settings for disk or snapshot
 * 
 */
public final class EncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    @Import(name="diskEncryptionSetId")
      private final @Nullable String diskEncryptionSetId;

    public Optional<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public EncryptionResponse(
        @Nullable String diskEncryptionSetId,
        @Nullable String type) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.type = type;
    }

    private EncryptionResponse() {
        this.diskEncryptionSetId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskEncryptionSetId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.type = defaults.type;
        }

        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public EncryptionResponse build() {
            return new EncryptionResponse(diskEncryptionSetId, type);
        }
    }
}
