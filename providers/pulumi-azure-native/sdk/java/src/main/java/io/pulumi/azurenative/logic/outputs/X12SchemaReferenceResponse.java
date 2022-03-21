// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class X12SchemaReferenceResponse {
    /**
     * The message id.
     * 
     */
    private final String messageId;
    /**
     * The schema name.
     * 
     */
    private final String schemaName;
    /**
     * The schema version.
     * 
     */
    private final String schemaVersion;
    /**
     * The sender application id.
     * 
     */
    private final @Nullable String senderApplicationId;

    @CustomType.Constructor
    private X12SchemaReferenceResponse(
        @CustomType.Parameter("messageId") String messageId,
        @CustomType.Parameter("schemaName") String schemaName,
        @CustomType.Parameter("schemaVersion") String schemaVersion,
        @CustomType.Parameter("senderApplicationId") @Nullable String senderApplicationId) {
        this.messageId = messageId;
        this.schemaName = schemaName;
        this.schemaVersion = schemaVersion;
        this.senderApplicationId = senderApplicationId;
    }

    /**
     * The message id.
     * 
    */
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * The schema name.
     * 
    */
    public String getSchemaName() {
        return this.schemaName;
    }
    /**
     * The schema version.
     * 
    */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * The sender application id.
     * 
    */
    public Optional<String> getSenderApplicationId() {
        return Optional.ofNullable(this.senderApplicationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SchemaReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;
        private String schemaName;
        private String schemaVersion;
        private @Nullable String senderApplicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SchemaReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
    	      this.schemaName = defaults.schemaName;
    	      this.schemaVersion = defaults.schemaVersion;
    	      this.senderApplicationId = defaults.senderApplicationId;
        }

        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = Objects.requireNonNull(schemaVersion);
            return this;
        }
        public Builder senderApplicationId(@Nullable String senderApplicationId) {
            this.senderApplicationId = senderApplicationId;
            return this;
        }        public X12SchemaReferenceResponse build() {
            return new X12SchemaReferenceResponse(messageId, schemaName, schemaVersion, senderApplicationId);
        }
    }
}
