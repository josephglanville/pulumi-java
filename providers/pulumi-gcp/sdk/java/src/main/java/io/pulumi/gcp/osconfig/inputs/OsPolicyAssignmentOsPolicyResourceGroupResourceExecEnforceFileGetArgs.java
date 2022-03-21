// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
      private final @Nullable Output<Boolean> allowInsecure;

    public Output<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Output.empty() : this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @Import(name="gcs")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs> gcs;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs> getGcs() {
        return this.gcs == null ? Output.empty() : this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath")
      private final @Nullable Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath == null ? Output.empty() : this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @Import(name="remote")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs> remote;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs> getRemote() {
        return this.remote == null ? Output.empty() : this.remote;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs(
        @Nullable Output<Boolean> allowInsecure,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs> gcs,
        @Nullable Output<String> localPath,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs() {
        this.allowInsecure = Output.empty();
        this.gcs = Output.empty();
        this.localPath = Output.empty();
        this.remote = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowInsecure;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs> gcs;
        private @Nullable Output<String> localPath;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }
        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Output.ofNullable(allowInsecure);
            return this;
        }
        public Builder gcs(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs> gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder gcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsGetArgs gcs) {
            this.gcs = Output.ofNullable(gcs);
            return this;
        }
        public Builder localPath(@Nullable Output<String> localPath) {
            this.localPath = localPath;
            return this;
        }
        public Builder localPath(@Nullable String localPath) {
            this.localPath = Output.ofNullable(localPath);
            return this;
        }
        public Builder remote(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs> remote) {
            this.remote = remote;
            return this;
        }
        public Builder remote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteGetArgs remote) {
            this.remote = Output.ofNullable(remote);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGetArgs(allowInsecure, gcs, localPath, remote);
        }
    }
}
