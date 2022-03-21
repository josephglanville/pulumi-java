// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryWorkspaceAccessPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryWorkspaceAccessPropertiesArgs Empty = new DirectoryWorkspaceAccessPropertiesArgs();

    /**
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeAndroid")
      private final @Nullable Output<String> deviceTypeAndroid;

    public Output<String> getDeviceTypeAndroid() {
        return this.deviceTypeAndroid == null ? Output.empty() : this.deviceTypeAndroid;
    }

    /**
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeChromeos")
      private final @Nullable Output<String> deviceTypeChromeos;

    public Output<String> getDeviceTypeChromeos() {
        return this.deviceTypeChromeos == null ? Output.empty() : this.deviceTypeChromeos;
    }

    /**
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeIos")
      private final @Nullable Output<String> deviceTypeIos;

    public Output<String> getDeviceTypeIos() {
        return this.deviceTypeIos == null ? Output.empty() : this.deviceTypeIos;
    }

    /**
     * Indicates whether users can use Linux clients to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeLinux")
      private final @Nullable Output<String> deviceTypeLinux;

    public Output<String> getDeviceTypeLinux() {
        return this.deviceTypeLinux == null ? Output.empty() : this.deviceTypeLinux;
    }

    /**
     * Indicates whether users can use macOS clients to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeOsx")
      private final @Nullable Output<String> deviceTypeOsx;

    public Output<String> getDeviceTypeOsx() {
        return this.deviceTypeOsx == null ? Output.empty() : this.deviceTypeOsx;
    }

    /**
     * Indicates whether users can access their WorkSpaces through a web browser.
     * 
     */
    @Import(name="deviceTypeWeb")
      private final @Nullable Output<String> deviceTypeWeb;

    public Output<String> getDeviceTypeWeb() {
        return this.deviceTypeWeb == null ? Output.empty() : this.deviceTypeWeb;
    }

    /**
     * Indicates whether users can use Windows clients to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeWindows")
      private final @Nullable Output<String> deviceTypeWindows;

    public Output<String> getDeviceTypeWindows() {
        return this.deviceTypeWindows == null ? Output.empty() : this.deviceTypeWindows;
    }

    /**
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * 
     */
    @Import(name="deviceTypeZeroclient")
      private final @Nullable Output<String> deviceTypeZeroclient;

    public Output<String> getDeviceTypeZeroclient() {
        return this.deviceTypeZeroclient == null ? Output.empty() : this.deviceTypeZeroclient;
    }

    public DirectoryWorkspaceAccessPropertiesArgs(
        @Nullable Output<String> deviceTypeAndroid,
        @Nullable Output<String> deviceTypeChromeos,
        @Nullable Output<String> deviceTypeIos,
        @Nullable Output<String> deviceTypeLinux,
        @Nullable Output<String> deviceTypeOsx,
        @Nullable Output<String> deviceTypeWeb,
        @Nullable Output<String> deviceTypeWindows,
        @Nullable Output<String> deviceTypeZeroclient) {
        this.deviceTypeAndroid = deviceTypeAndroid;
        this.deviceTypeChromeos = deviceTypeChromeos;
        this.deviceTypeIos = deviceTypeIos;
        this.deviceTypeLinux = deviceTypeLinux;
        this.deviceTypeOsx = deviceTypeOsx;
        this.deviceTypeWeb = deviceTypeWeb;
        this.deviceTypeWindows = deviceTypeWindows;
        this.deviceTypeZeroclient = deviceTypeZeroclient;
    }

    private DirectoryWorkspaceAccessPropertiesArgs() {
        this.deviceTypeAndroid = Output.empty();
        this.deviceTypeChromeos = Output.empty();
        this.deviceTypeIos = Output.empty();
        this.deviceTypeLinux = Output.empty();
        this.deviceTypeOsx = Output.empty();
        this.deviceTypeWeb = Output.empty();
        this.deviceTypeWindows = Output.empty();
        this.deviceTypeZeroclient = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryWorkspaceAccessPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceTypeAndroid;
        private @Nullable Output<String> deviceTypeChromeos;
        private @Nullable Output<String> deviceTypeIos;
        private @Nullable Output<String> deviceTypeLinux;
        private @Nullable Output<String> deviceTypeOsx;
        private @Nullable Output<String> deviceTypeWeb;
        private @Nullable Output<String> deviceTypeWindows;
        private @Nullable Output<String> deviceTypeZeroclient;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryWorkspaceAccessPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceTypeAndroid = defaults.deviceTypeAndroid;
    	      this.deviceTypeChromeos = defaults.deviceTypeChromeos;
    	      this.deviceTypeIos = defaults.deviceTypeIos;
    	      this.deviceTypeLinux = defaults.deviceTypeLinux;
    	      this.deviceTypeOsx = defaults.deviceTypeOsx;
    	      this.deviceTypeWeb = defaults.deviceTypeWeb;
    	      this.deviceTypeWindows = defaults.deviceTypeWindows;
    	      this.deviceTypeZeroclient = defaults.deviceTypeZeroclient;
        }

        public Builder deviceTypeAndroid(@Nullable Output<String> deviceTypeAndroid) {
            this.deviceTypeAndroid = deviceTypeAndroid;
            return this;
        }
        public Builder deviceTypeAndroid(@Nullable String deviceTypeAndroid) {
            this.deviceTypeAndroid = Output.ofNullable(deviceTypeAndroid);
            return this;
        }
        public Builder deviceTypeChromeos(@Nullable Output<String> deviceTypeChromeos) {
            this.deviceTypeChromeos = deviceTypeChromeos;
            return this;
        }
        public Builder deviceTypeChromeos(@Nullable String deviceTypeChromeos) {
            this.deviceTypeChromeos = Output.ofNullable(deviceTypeChromeos);
            return this;
        }
        public Builder deviceTypeIos(@Nullable Output<String> deviceTypeIos) {
            this.deviceTypeIos = deviceTypeIos;
            return this;
        }
        public Builder deviceTypeIos(@Nullable String deviceTypeIos) {
            this.deviceTypeIos = Output.ofNullable(deviceTypeIos);
            return this;
        }
        public Builder deviceTypeLinux(@Nullable Output<String> deviceTypeLinux) {
            this.deviceTypeLinux = deviceTypeLinux;
            return this;
        }
        public Builder deviceTypeLinux(@Nullable String deviceTypeLinux) {
            this.deviceTypeLinux = Output.ofNullable(deviceTypeLinux);
            return this;
        }
        public Builder deviceTypeOsx(@Nullable Output<String> deviceTypeOsx) {
            this.deviceTypeOsx = deviceTypeOsx;
            return this;
        }
        public Builder deviceTypeOsx(@Nullable String deviceTypeOsx) {
            this.deviceTypeOsx = Output.ofNullable(deviceTypeOsx);
            return this;
        }
        public Builder deviceTypeWeb(@Nullable Output<String> deviceTypeWeb) {
            this.deviceTypeWeb = deviceTypeWeb;
            return this;
        }
        public Builder deviceTypeWeb(@Nullable String deviceTypeWeb) {
            this.deviceTypeWeb = Output.ofNullable(deviceTypeWeb);
            return this;
        }
        public Builder deviceTypeWindows(@Nullable Output<String> deviceTypeWindows) {
            this.deviceTypeWindows = deviceTypeWindows;
            return this;
        }
        public Builder deviceTypeWindows(@Nullable String deviceTypeWindows) {
            this.deviceTypeWindows = Output.ofNullable(deviceTypeWindows);
            return this;
        }
        public Builder deviceTypeZeroclient(@Nullable Output<String> deviceTypeZeroclient) {
            this.deviceTypeZeroclient = deviceTypeZeroclient;
            return this;
        }
        public Builder deviceTypeZeroclient(@Nullable String deviceTypeZeroclient) {
            this.deviceTypeZeroclient = Output.ofNullable(deviceTypeZeroclient);
            return this;
        }        public DirectoryWorkspaceAccessPropertiesArgs build() {
            return new DirectoryWorkspaceAccessPropertiesArgs(deviceTypeAndroid, deviceTypeChromeos, deviceTypeIos, deviceTypeLinux, deviceTypeOsx, deviceTypeWeb, deviceTypeWindows, deviceTypeZeroclient);
        }
    }
}
