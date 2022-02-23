// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger based on status code.
 * 
 */
public final class StatusCodesBasedTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusCodesBasedTriggerArgs Empty = new StatusCodesBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Request Path
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * HTTP status code.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Integer> status;

    public Input<Integer> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Request Sub Status.
     * 
     */
    @InputImport(name="subStatus")
      private final @Nullable Input<Integer> subStatus;

    public Input<Integer> getSubStatus() {
        return this.subStatus == null ? Input.empty() : this.subStatus;
    }

    /**
     * Time interval.
     * 
     */
    @InputImport(name="timeInterval")
      private final @Nullable Input<String> timeInterval;

    public Input<String> getTimeInterval() {
        return this.timeInterval == null ? Input.empty() : this.timeInterval;
    }

    /**
     * Win32 error code.
     * 
     */
    @InputImport(name="win32Status")
      private final @Nullable Input<Integer> win32Status;

    public Input<Integer> getWin32Status() {
        return this.win32Status == null ? Input.empty() : this.win32Status;
    }

    public StatusCodesBasedTriggerArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<String> path,
        @Nullable Input<Integer> status,
        @Nullable Input<Integer> subStatus,
        @Nullable Input<String> timeInterval,
        @Nullable Input<Integer> win32Status) {
        this.count = count;
        this.path = path;
        this.status = status;
        this.subStatus = subStatus;
        this.timeInterval = timeInterval;
        this.win32Status = win32Status;
    }

    private StatusCodesBasedTriggerArgs() {
        this.count = Input.empty();
        this.path = Input.empty();
        this.status = Input.empty();
        this.subStatus = Input.empty();
        this.timeInterval = Input.empty();
        this.win32Status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> status;
        private @Nullable Input<Integer> subStatus;
        private @Nullable Input<String> timeInterval;
        private @Nullable Input<Integer> win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesBasedTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
    	      this.timeInterval = defaults.timeInterval;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setStatus(@Nullable Input<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Integer status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setSubStatus(@Nullable Input<Integer> subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder setSubStatus(@Nullable Integer subStatus) {
            this.subStatus = Input.ofNullable(subStatus);
            return this;
        }

        public Builder setTimeInterval(@Nullable Input<String> timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = Input.ofNullable(timeInterval);
            return this;
        }

        public Builder setWin32Status(@Nullable Input<Integer> win32Status) {
            this.win32Status = win32Status;
            return this;
        }

        public Builder setWin32Status(@Nullable Integer win32Status) {
            this.win32Status = Input.ofNullable(win32Status);
            return this;
        }
        public StatusCodesBasedTriggerArgs build() {
            return new StatusCodesBasedTriggerArgs(count, path, status, subStatus, timeInterval, win32Status);
        }
    }
}
