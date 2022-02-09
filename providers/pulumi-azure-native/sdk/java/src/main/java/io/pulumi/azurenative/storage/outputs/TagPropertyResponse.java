// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TagPropertyResponse {
    private final String objectIdentifier;
    private final String tag;
    private final String tenantId;
    private final String timestamp;
    private final String upn;

    @OutputCustomType.Constructor({"objectIdentifier","tag","tenantId","timestamp","upn"})
    private TagPropertyResponse(
        String objectIdentifier,
        String tag,
        String tenantId,
        String timestamp,
        String upn) {
        this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
        this.tag = Objects.requireNonNull(tag);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.timestamp = Objects.requireNonNull(timestamp);
        this.upn = Objects.requireNonNull(upn);
    }

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }
    public String getTag() {
        return this.tag;
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public String getTimestamp() {
        return this.timestamp;
    }
    public String getUpn() {
        return this.upn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectIdentifier;
        private String tag;
        private String tenantId;
        private String timestamp;
        private String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(TagPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdentifier = defaults.objectIdentifier;
    	      this.tag = defaults.tag;
    	      this.tenantId = defaults.tenantId;
    	      this.timestamp = defaults.timestamp;
    	      this.upn = defaults.upn;
        }

        public Builder setObjectIdentifier(String objectIdentifier) {
            this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setUpn(String upn) {
            this.upn = Objects.requireNonNull(upn);
            return this;
        }

        public TagPropertyResponse build() {
            return new TagPropertyResponse(objectIdentifier, tag, tenantId, timestamp, upn);
        }
    }
}
