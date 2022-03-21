// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An entry for an Access Control list.
 * 
 */
public final class AclEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AclEntryResponse Empty = new AclEntryResponse();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime", required=true)
      private final String expirationTime;

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * This is always `sql#aclEntry`.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Optional. A label to identify this entry.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public AclEntryResponse(
        String expirationTime,
        String kind,
        String name,
        String value) {
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AclEntryResponse() {
        this.expirationTime = null;
        this.kind = null;
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String kind;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AclEntryResponse build() {
            return new AclEntryResponse(expirationTime, kind, name, value);
        }
    }
}
