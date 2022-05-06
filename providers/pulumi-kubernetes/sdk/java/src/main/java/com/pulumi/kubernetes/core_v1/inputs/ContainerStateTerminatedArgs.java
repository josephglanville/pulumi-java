// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ContainerStateTerminated is a terminated state of a container.
 * 
 */
public final class ContainerStateTerminatedArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerStateTerminatedArgs Empty = new ContainerStateTerminatedArgs();

    /**
     * Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
     * 
     */
    @Import(name="containerID")
    private @Nullable Output<String> containerID;

    /**
     * @return Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
     * 
     */
    public Optional<Output<String>> containerID() {
        return Optional.ofNullable(this.containerID);
    }

    /**
     * Exit status from the last termination of the container
     * 
     */
    @Import(name="exitCode", required=true)
    private Output<Integer> exitCode;

    /**
     * @return Exit status from the last termination of the container
     * 
     */
    public Output<Integer> exitCode() {
        return this.exitCode;
    }

    /**
     * Time at which the container last terminated
     * 
     */
    @Import(name="finishedAt")
    private @Nullable Output<String> finishedAt;

    /**
     * @return Time at which the container last terminated
     * 
     */
    public Optional<Output<String>> finishedAt() {
        return Optional.ofNullable(this.finishedAt);
    }

    /**
     * Message regarding the last termination of the container
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Message regarding the last termination of the container
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * (brief) reason from the last termination of the container
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return (brief) reason from the last termination of the container
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Signal from the last termination of the container
     * 
     */
    @Import(name="signal")
    private @Nullable Output<Integer> signal;

    /**
     * @return Signal from the last termination of the container
     * 
     */
    public Optional<Output<Integer>> signal() {
        return Optional.ofNullable(this.signal);
    }

    /**
     * Time at which previous execution of the container started
     * 
     */
    @Import(name="startedAt")
    private @Nullable Output<String> startedAt;

    /**
     * @return Time at which previous execution of the container started
     * 
     */
    public Optional<Output<String>> startedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    private ContainerStateTerminatedArgs() {}

    private ContainerStateTerminatedArgs(ContainerStateTerminatedArgs $) {
        this.containerID = $.containerID;
        this.exitCode = $.exitCode;
        this.finishedAt = $.finishedAt;
        this.message = $.message;
        this.reason = $.reason;
        this.signal = $.signal;
        this.startedAt = $.startedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerStateTerminatedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerStateTerminatedArgs $;

        public Builder() {
            $ = new ContainerStateTerminatedArgs();
        }

        public Builder(ContainerStateTerminatedArgs defaults) {
            $ = new ContainerStateTerminatedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerID Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
         * 
         * @return builder
         * 
         */
        public Builder containerID(@Nullable Output<String> containerID) {
            $.containerID = containerID;
            return this;
        }

        /**
         * @param containerID Container&#39;s ID in the format &#39;&lt;type&gt;://&lt;container_id&gt;&#39;
         * 
         * @return builder
         * 
         */
        public Builder containerID(String containerID) {
            return containerID(Output.of(containerID));
        }

        /**
         * @param exitCode Exit status from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder exitCode(Output<Integer> exitCode) {
            $.exitCode = exitCode;
            return this;
        }

        /**
         * @param exitCode Exit status from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder exitCode(Integer exitCode) {
            return exitCode(Output.of(exitCode));
        }

        /**
         * @param finishedAt Time at which the container last terminated
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(@Nullable Output<String> finishedAt) {
            $.finishedAt = finishedAt;
            return this;
        }

        /**
         * @param finishedAt Time at which the container last terminated
         * 
         * @return builder
         * 
         */
        public Builder finishedAt(String finishedAt) {
            return finishedAt(Output.of(finishedAt));
        }

        /**
         * @param message Message regarding the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message regarding the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason (brief) reason from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason (brief) reason from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param signal Signal from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder signal(@Nullable Output<Integer> signal) {
            $.signal = signal;
            return this;
        }

        /**
         * @param signal Signal from the last termination of the container
         * 
         * @return builder
         * 
         */
        public Builder signal(Integer signal) {
            return signal(Output.of(signal));
        }

        /**
         * @param startedAt Time at which previous execution of the container started
         * 
         * @return builder
         * 
         */
        public Builder startedAt(@Nullable Output<String> startedAt) {
            $.startedAt = startedAt;
            return this;
        }

        /**
         * @param startedAt Time at which previous execution of the container started
         * 
         * @return builder
         * 
         */
        public Builder startedAt(String startedAt) {
            return startedAt(Output.of(startedAt));
        }

        public ContainerStateTerminatedArgs build() {
            $.exitCode = Objects.requireNonNull($.exitCode, "expected parameter 'exitCode' to be non-null");
            return $;
        }
    }

}
