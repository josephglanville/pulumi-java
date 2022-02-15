// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FileResponse {
    private final String content;
    private final String fingerprint;
    private final String name;

    @OutputCustomType.Constructor({"content","fingerprint","name"})
    private FileResponse(
        String content,
        String fingerprint,
        String name) {
        this.content = Objects.requireNonNull(content);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.name = Objects.requireNonNull(name);
    }

    public String getContent() {
        return this.content;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String fingerprint;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public FileResponse build() {
            return new FileResponse(content, fingerprint, name);
        }
    }
}