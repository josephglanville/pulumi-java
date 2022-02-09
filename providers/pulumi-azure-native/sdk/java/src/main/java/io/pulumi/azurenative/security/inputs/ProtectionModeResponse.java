// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProtectionModeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProtectionModeResponse Empty = new ProtectionModeResponse();

    @InputImport(name="exe")
    private final @Nullable String exe;

    public Optional<String> getExe() {
        return this.exe == null ? Optional.empty() : Optional.ofNullable(this.exe);
    }

    @InputImport(name="executable")
    private final @Nullable String executable;

    public Optional<String> getExecutable() {
        return this.executable == null ? Optional.empty() : Optional.ofNullable(this.executable);
    }

    @InputImport(name="msi")
    private final @Nullable String msi;

    public Optional<String> getMsi() {
        return this.msi == null ? Optional.empty() : Optional.ofNullable(this.msi);
    }

    @InputImport(name="script")
    private final @Nullable String script;

    public Optional<String> getScript() {
        return this.script == null ? Optional.empty() : Optional.ofNullable(this.script);
    }

    public ProtectionModeResponse(
        @Nullable String exe,
        @Nullable String executable,
        @Nullable String msi,
        @Nullable String script) {
        this.exe = exe;
        this.executable = executable;
        this.msi = msi;
        this.script = script;
    }

    private ProtectionModeResponse() {
        this.exe = null;
        this.executable = null;
        this.msi = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionModeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exe;
        private @Nullable String executable;
        private @Nullable String msi;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionModeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exe = defaults.exe;
    	      this.executable = defaults.executable;
    	      this.msi = defaults.msi;
    	      this.script = defaults.script;
        }

        public Builder setExe(@Nullable String exe) {
            this.exe = exe;
            return this;
        }

        public Builder setExecutable(@Nullable String executable) {
            this.executable = executable;
            return this;
        }

        public Builder setMsi(@Nullable String msi) {
            this.msi = msi;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public ProtectionModeResponse build() {
            return new ProtectionModeResponse(exe, executable, msi, script);
        }
    }
}
