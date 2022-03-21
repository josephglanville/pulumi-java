// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudkms_v1.enums.ImportJobImportMethod;
import io.pulumi.googlenative.cloudkms_v1.enums.ImportJobProtectionLevel;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImportJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImportJobArgs Empty = new ImportJobArgs();

    @Import(name="importJobId", required=true)
      private final Output<String> importJobId;

    public Output<String> getImportJobId() {
        return this.importJobId;
    }

    /**
     * Immutable. The wrapping method to be used for incoming key material.
     * 
     */
    @Import(name="importMethod", required=true)
      private final Output<ImportJobImportMethod> importMethod;

    public Output<ImportJobImportMethod> getImportMethod() {
        return this.importMethod;
    }

    @Import(name="keyRingId", required=true)
      private final Output<String> keyRingId;

    public Output<String> getKeyRingId() {
        return this.keyRingId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Immutable. The protection level of the ImportJob. This must match the protection_level of the version_template on the CryptoKey you attempt to import into.
     * 
     */
    @Import(name="protectionLevel", required=true)
      private final Output<ImportJobProtectionLevel> protectionLevel;

    public Output<ImportJobProtectionLevel> getProtectionLevel() {
        return this.protectionLevel;
    }

    public ImportJobArgs(
        Output<String> importJobId,
        Output<ImportJobImportMethod> importMethod,
        Output<String> keyRingId,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<ImportJobProtectionLevel> protectionLevel) {
        this.importJobId = Objects.requireNonNull(importJobId, "expected parameter 'importJobId' to be non-null");
        this.importMethod = Objects.requireNonNull(importMethod, "expected parameter 'importMethod' to be non-null");
        this.keyRingId = Objects.requireNonNull(keyRingId, "expected parameter 'keyRingId' to be non-null");
        this.location = location;
        this.project = project;
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
    }

    private ImportJobArgs() {
        this.importJobId = Output.empty();
        this.importMethod = Output.empty();
        this.keyRingId = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.protectionLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> importJobId;
        private Output<ImportJobImportMethod> importMethod;
        private Output<String> keyRingId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<ImportJobProtectionLevel> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importJobId = defaults.importJobId;
    	      this.importMethod = defaults.importMethod;
    	      this.keyRingId = defaults.keyRingId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder importJobId(Output<String> importJobId) {
            this.importJobId = Objects.requireNonNull(importJobId);
            return this;
        }
        public Builder importJobId(String importJobId) {
            this.importJobId = Output.of(Objects.requireNonNull(importJobId));
            return this;
        }
        public Builder importMethod(Output<ImportJobImportMethod> importMethod) {
            this.importMethod = Objects.requireNonNull(importMethod);
            return this;
        }
        public Builder importMethod(ImportJobImportMethod importMethod) {
            this.importMethod = Output.of(Objects.requireNonNull(importMethod));
            return this;
        }
        public Builder keyRingId(Output<String> keyRingId) {
            this.keyRingId = Objects.requireNonNull(keyRingId);
            return this;
        }
        public Builder keyRingId(String keyRingId) {
            this.keyRingId = Output.of(Objects.requireNonNull(keyRingId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder protectionLevel(Output<ImportJobProtectionLevel> protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }
        public Builder protectionLevel(ImportJobProtectionLevel protectionLevel) {
            this.protectionLevel = Output.of(Objects.requireNonNull(protectionLevel));
            return this;
        }        public ImportJobArgs build() {
            return new ImportJobArgs(importJobId, importMethod, keyRingId, location, project, protectionLevel);
        }
    }
}
