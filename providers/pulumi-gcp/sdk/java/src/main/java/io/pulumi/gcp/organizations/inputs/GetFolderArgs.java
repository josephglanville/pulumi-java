// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFolderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderArgs Empty = new GetFolderArgs();

    /**
     * The name of the Folder in the form `{folder_id}` or `folders/{folder_id}`.
     * 
     */
    @InputImport(name="folder", required=true)
      private final String folder;

    public String getFolder() {
        return this.folder;
    }

    /**
     * `true` to find the organization that the folder belongs, `false` to avoid the lookup. It searches up the tree. (defaults to `false`)
     * 
     */
    @InputImport(name="lookupOrganization")
      private final @Nullable Boolean lookupOrganization;

    public Optional<Boolean> getLookupOrganization() {
        return this.lookupOrganization == null ? Optional.empty() : Optional.ofNullable(this.lookupOrganization);
    }

    public GetFolderArgs(
        String folder,
        @Nullable Boolean lookupOrganization) {
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.lookupOrganization = lookupOrganization;
    }

    private GetFolderArgs() {
        this.folder = null;
        this.lookupOrganization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folder;
        private @Nullable Boolean lookupOrganization;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folder = defaults.folder;
    	      this.lookupOrganization = defaults.lookupOrganization;
        }

        public Builder setFolder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setLookupOrganization(@Nullable Boolean lookupOrganization) {
            this.lookupOrganization = lookupOrganization;
            return this;
        }
        public GetFolderArgs build() {
            return new GetFolderArgs(folder, lookupOrganization);
        }
    }
}
