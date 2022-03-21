// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.VirtualMFADeviceTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMFADeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMFADeviceArgs Empty = new VirtualMFADeviceArgs();

    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    @Import(name="tags")
      private final @Nullable Output<List<VirtualMFADeviceTagArgs>> tags;

    public Output<List<VirtualMFADeviceTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="users", required=true)
      private final Output<List<String>> users;

    public Output<List<String>> getUsers() {
        return this.users;
    }

    @Import(name="virtualMfaDeviceName")
      private final @Nullable Output<String> virtualMfaDeviceName;

    public Output<String> getVirtualMfaDeviceName() {
        return this.virtualMfaDeviceName == null ? Output.empty() : this.virtualMfaDeviceName;
    }

    public VirtualMFADeviceArgs(
        @Nullable Output<String> path,
        @Nullable Output<List<VirtualMFADeviceTagArgs>> tags,
        Output<List<String>> users,
        @Nullable Output<String> virtualMfaDeviceName) {
        this.path = path;
        this.tags = tags;
        this.users = Objects.requireNonNull(users, "expected parameter 'users' to be non-null");
        this.virtualMfaDeviceName = virtualMfaDeviceName;
    }

    private VirtualMFADeviceArgs() {
        this.path = Output.empty();
        this.tags = Output.empty();
        this.users = Output.empty();
        this.virtualMfaDeviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMFADeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> path;
        private @Nullable Output<List<VirtualMFADeviceTagArgs>> tags;
        private Output<List<String>> users;
        private @Nullable Output<String> virtualMfaDeviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMFADeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.tags = defaults.tags;
    	      this.users = defaults.users;
    	      this.virtualMfaDeviceName = defaults.virtualMfaDeviceName;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder tags(@Nullable Output<List<VirtualMFADeviceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<VirtualMFADeviceTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(VirtualMFADeviceTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder users(Output<List<String>> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(List<String> users) {
            this.users = Output.of(Objects.requireNonNull(users));
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public Builder virtualMfaDeviceName(@Nullable Output<String> virtualMfaDeviceName) {
            this.virtualMfaDeviceName = virtualMfaDeviceName;
            return this;
        }
        public Builder virtualMfaDeviceName(@Nullable String virtualMfaDeviceName) {
            this.virtualMfaDeviceName = Output.ofNullable(virtualMfaDeviceName);
            return this;
        }        public VirtualMFADeviceArgs build() {
            return new VirtualMFADeviceArgs(path, tags, users, virtualMfaDeviceName);
        }
    }
}
