// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.testing_v1.inputs.AccountArgs;
import io.pulumi.googlenative.testing_v1.inputs.ApkArgs;
import io.pulumi.googlenative.testing_v1.inputs.DeviceFileArgs;
import io.pulumi.googlenative.testing_v1.inputs.EnvironmentVariableArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A description of how to set up the Android device prior to running the test.
 * 
 */
public final class TestSetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestSetupArgs Empty = new TestSetupArgs();

    /**
     * The device will be logged in on this account for the duration of the test.
     * 
     */
    @Import(name="account")
      private final @Nullable Output<AccountArgs> account;

    public Output<AccountArgs> getAccount() {
        return this.account == null ? Codegen.empty() : this.account;
    }

    /**
     * APKs to install in addition to those being directly tested. Currently capped at 100.
     * 
     */
    @Import(name="additionalApks")
      private final @Nullable Output<List<ApkArgs>> additionalApks;

    public Output<List<ApkArgs>> getAdditionalApks() {
        return this.additionalApks == null ? Codegen.empty() : this.additionalApks;
    }

    /**
     * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device.
     * 
     */
    @Import(name="directoriesToPull")
      private final @Nullable Output<List<String>> directoriesToPull;

    public Output<List<String>> getDirectoriesToPull() {
        return this.directoriesToPull == null ? Codegen.empty() : this.directoriesToPull;
    }

    /**
     * Whether to prevent all runtime permissions to be granted at app install
     * 
     */
    @Import(name="dontAutograntPermissions")
      private final @Nullable Output<Boolean> dontAutograntPermissions;

    public Output<Boolean> getDontAutograntPermissions() {
        return this.dontAutograntPermissions == null ? Codegen.empty() : this.dontAutograntPermissions;
    }

    /**
     * Environment variables to set for the test (only applicable for instrumentation tests).
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    public Output<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Codegen.empty() : this.environmentVariables;
    }

    /**
     * List of files to push to the device before starting the test.
     * 
     */
    @Import(name="filesToPush")
      private final @Nullable Output<List<DeviceFileArgs>> filesToPush;

    public Output<List<DeviceFileArgs>> getFilesToPush() {
        return this.filesToPush == null ? Codegen.empty() : this.filesToPush;
    }

    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable Output<String> networkProfile;

    public Output<String> getNetworkProfile() {
        return this.networkProfile == null ? Codegen.empty() : this.networkProfile;
    }

    public TestSetupArgs(
        @Nullable Output<AccountArgs> account,
        @Nullable Output<List<ApkArgs>> additionalApks,
        @Nullable Output<List<String>> directoriesToPull,
        @Nullable Output<Boolean> dontAutograntPermissions,
        @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables,
        @Nullable Output<List<DeviceFileArgs>> filesToPush,
        @Nullable Output<String> networkProfile) {
        this.account = account;
        this.additionalApks = additionalApks;
        this.directoriesToPull = directoriesToPull;
        this.dontAutograntPermissions = dontAutograntPermissions;
        this.environmentVariables = environmentVariables;
        this.filesToPush = filesToPush;
        this.networkProfile = networkProfile;
    }

    private TestSetupArgs() {
        this.account = Codegen.empty();
        this.additionalApks = Codegen.empty();
        this.directoriesToPull = Codegen.empty();
        this.dontAutograntPermissions = Codegen.empty();
        this.environmentVariables = Codegen.empty();
        this.filesToPush = Codegen.empty();
        this.networkProfile = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccountArgs> account;
        private @Nullable Output<List<ApkArgs>> additionalApks;
        private @Nullable Output<List<String>> directoriesToPull;
        private @Nullable Output<Boolean> dontAutograntPermissions;
        private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;
        private @Nullable Output<List<DeviceFileArgs>> filesToPush;
        private @Nullable Output<String> networkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.additionalApks = defaults.additionalApks;
    	      this.directoriesToPull = defaults.directoriesToPull;
    	      this.dontAutograntPermissions = defaults.dontAutograntPermissions;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.filesToPush = defaults.filesToPush;
    	      this.networkProfile = defaults.networkProfile;
        }

        public Builder account(@Nullable Output<AccountArgs> account) {
            this.account = account;
            return this;
        }
        public Builder account(@Nullable AccountArgs account) {
            this.account = Codegen.ofNullable(account);
            return this;
        }
        public Builder additionalApks(@Nullable Output<List<ApkArgs>> additionalApks) {
            this.additionalApks = additionalApks;
            return this;
        }
        public Builder additionalApks(@Nullable List<ApkArgs> additionalApks) {
            this.additionalApks = Codegen.ofNullable(additionalApks);
            return this;
        }
        public Builder additionalApks(ApkArgs... additionalApks) {
            return additionalApks(List.of(additionalApks));
        }
        public Builder directoriesToPull(@Nullable Output<List<String>> directoriesToPull) {
            this.directoriesToPull = directoriesToPull;
            return this;
        }
        public Builder directoriesToPull(@Nullable List<String> directoriesToPull) {
            this.directoriesToPull = Codegen.ofNullable(directoriesToPull);
            return this;
        }
        public Builder directoriesToPull(String... directoriesToPull) {
            return directoriesToPull(List.of(directoriesToPull));
        }
        public Builder dontAutograntPermissions(@Nullable Output<Boolean> dontAutograntPermissions) {
            this.dontAutograntPermissions = dontAutograntPermissions;
            return this;
        }
        public Builder dontAutograntPermissions(@Nullable Boolean dontAutograntPermissions) {
            this.dontAutograntPermissions = Codegen.ofNullable(dontAutograntPermissions);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Codegen.ofNullable(environmentVariables);
            return this;
        }
        public Builder environmentVariables(EnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder filesToPush(@Nullable Output<List<DeviceFileArgs>> filesToPush) {
            this.filesToPush = filesToPush;
            return this;
        }
        public Builder filesToPush(@Nullable List<DeviceFileArgs> filesToPush) {
            this.filesToPush = Codegen.ofNullable(filesToPush);
            return this;
        }
        public Builder filesToPush(DeviceFileArgs... filesToPush) {
            return filesToPush(List.of(filesToPush));
        }
        public Builder networkProfile(@Nullable Output<String> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }
        public Builder networkProfile(@Nullable String networkProfile) {
            this.networkProfile = Codegen.ofNullable(networkProfile);
            return this;
        }        public TestSetupArgs build() {
            return new TestSetupArgs(account, additionalApks, directoriesToPull, dontAutograntPermissions, environmentVariables, filesToPush, networkProfile);
        }
    }
}
