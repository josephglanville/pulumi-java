// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the VM.
 * 
 */
public final class VMInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMInfoResponse Empty = new VMInfoResponse();

    /**
     * Azure resource Id of the VM.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * UUID(Universally Unique Identifier) of the VM.
     * 
     */
    @Import(name="uuid", required=true)
      private final String uuid;

    public String getUuid() {
        return this.uuid;
    }

    public VMInfoResponse(
        String id,
        String uuid) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.uuid = Objects.requireNonNull(uuid, "expected parameter 'uuid' to be non-null");
    }

    private VMInfoResponse() {
        this.id = null;
        this.uuid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(VMInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uuid = defaults.uuid;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }        public VMInfoResponse build() {
            return new VMInfoResponse(id, uuid);
        }
    }
}
