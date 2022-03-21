// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderContactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderContactArgs Empty = new GetFolderContactArgs();

    @Import(name="contactId", required=true)
      private final String contactId;

    public String getContactId() {
        return this.contactId;
    }

    @Import(name="folderId", required=true)
      private final String folderId;

    public String getFolderId() {
        return this.folderId;
    }

    public GetFolderContactArgs(
        String contactId,
        String folderId) {
        this.contactId = Objects.requireNonNull(contactId, "expected parameter 'contactId' to be non-null");
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
    }

    private GetFolderContactArgs() {
        this.contactId = null;
        this.folderId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactId;
        private String folderId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactId = defaults.contactId;
    	      this.folderId = defaults.folderId;
        }

        public Builder contactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }
        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }        public GetFolderContactArgs build() {
            return new GetFolderContactArgs(contactId, folderId);
        }
    }
}
