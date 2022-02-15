// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationLogEncoding;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationLog extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationLog Empty = new ApplicationLog();

    @InputImport(name="encoding")
    private final @Nullable ApplicationLogEncoding encoding;

    public Optional<ApplicationLogEncoding> getEncoding() {
        return this.encoding == null ? Optional.empty() : Optional.ofNullable(this.encoding);
    }

    @InputImport(name="logGroupName")
    private final @Nullable String logGroupName;

    public Optional<String> getLogGroupName() {
        return this.logGroupName == null ? Optional.empty() : Optional.ofNullable(this.logGroupName);
    }

    @InputImport(name="logPath")
    private final @Nullable String logPath;

    public Optional<String> getLogPath() {
        return this.logPath == null ? Optional.empty() : Optional.ofNullable(this.logPath);
    }

    @InputImport(name="logType", required=true)
    private final String logType;

    public String getLogType() {
        return this.logType;
    }

    @InputImport(name="patternSet")
    private final @Nullable String patternSet;

    public Optional<String> getPatternSet() {
        return this.patternSet == null ? Optional.empty() : Optional.ofNullable(this.patternSet);
    }

    public ApplicationLog(
        @Nullable ApplicationLogEncoding encoding,
        @Nullable String logGroupName,
        @Nullable String logPath,
        String logType,
        @Nullable String patternSet) {
        this.encoding = encoding;
        this.logGroupName = logGroupName;
        this.logPath = logPath;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
        this.patternSet = patternSet;
    }

    private ApplicationLog() {
        this.encoding = null;
        this.logGroupName = null;
        this.logPath = null;
        this.logType = null;
        this.patternSet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationLogEncoding encoding;
        private @Nullable String logGroupName;
        private @Nullable String logPath;
        private String logType;
        private @Nullable String patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logPath = defaults.logPath;
    	      this.logType = defaults.logType;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder setEncoding(@Nullable ApplicationLogEncoding encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogPath(@Nullable String logPath) {
            this.logPath = logPath;
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setPatternSet(@Nullable String patternSet) {
            this.patternSet = patternSet;
            return this;
        }

        public ApplicationLog build() {
            return new ApplicationLog(encoding, logGroupName, logPath, logType, patternSet);
        }
    }
}